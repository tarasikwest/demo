package westland.com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Max Shtanko on 1April, 2017.
 */
@Service
public class MailService {

    @Value("${mail.smtp.host}")
    private String smtpHost;

    @Value("${mail.smtp.user}")
    private String smtpUser;

    @Value("${mail.smtp.password}")
    private String smtpPassword;

    public void sendCV(CVData data, MultipartFile fileCv) throws IOException, MessagingException {

        Properties properties = getConnectionProperties();

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(smtpUser, smtpPassword);
            }
        });

        //  Send confirmation e-mail to the user
        //  Create a multipart message
        Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(smtpUser));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(data.getEmail()));
        message.setSubject(String.format("Bevestiging ontvangst open sollicitatie / CV upload"
        ));

        Multipart multipart = new MimeMultipart();

        //  Prepare and set message body
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(String.format("Hi %s %s %s, \n " +
                        "\n" +
                        "Wij hebben het volgende in goede orde ontvangen: \n" +
                        "First name: \n" +
                        "%s \n" +
                        "Middle name: \n" +
                        "%s \n" +
                        "%s, %s, %s, %s.",
                data.getFirstName(),
                data.getMiddleName(),
                data.getLastName(),
                data.getFirstName(),
                data.getMiddleName(),
                data.getLastName(),
                data.getSubject(),
                data.getMotivation(),
                data.getEmail()
        ));

        multipart.addBodyPart(messageBodyPart);

        // Prepare and set attachment
        if (fileCv != null) {
            BodyPart fileBodyPartCV = new MimeBodyPart();
            fileBodyPartCV.setDataHandler(new DataHandler(new ByteArrayDataSource(fileCv.getInputStream(), "application/octet-stream")));
            multipart.addBodyPart(fileBodyPartCV);    // attachment
        }

        message.setContent(multipart);

        // Sending message
        Transport.send(message);
    }




    private Properties getConnectionProperties() {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        return properties;
    }
}

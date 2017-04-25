package westland.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import westland.com.service.MailService;
import westland.com.service.CVData;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class FileController {

    @Autowired
    MailService mailService;

    @RequestMapping(value = "/uploadCV", method = RequestMethod.POST)
    public String uploadCV(@RequestBody CVData data /*, @RequestBody MultipartFile file */) throws IOException, MessagingException {

        mailService.sendCV(data, null);
        return "OK";
    }


}

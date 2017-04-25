package westland.com.service;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Max Shtanko on 2April, 2017.
 */
public class CVData {
    @JsonProperty("first-name")
    String firstName;

    @JsonProperty("middle-name")
    String middleName;

    @JsonProperty("last-name")
    String lastName;

    @JsonProperty("email")
    String email;

    //  TODO: What the fuck is "subject"? Where in e-mail it should be mentioned?
    @JsonProperty("subject")
    String subject;

    //  TODO: What the fuck is "motivation"? Where in e-mail it should be mentioned?
    @JsonProperty("motivation")
    String motivation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
}

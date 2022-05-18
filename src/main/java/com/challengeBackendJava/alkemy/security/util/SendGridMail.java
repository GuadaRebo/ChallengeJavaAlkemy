
package com.challengeBackendJava.alkemy.security.util;

import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import lombok.Getter;


public class SendGridMail {
    @Getter
    private Email from = new Email("guadi12@hotmail.com");
    @Getter
    private Email to = null;
    @Getter
    private String subject = "Registration to Disney App successful";
    @Getter
    private Content content = new Content("text/plain",
            "Thank you for joining Disney App. \nWe hope you have a great time with us!");

    public SendGridMail(String to){
        this.to = new Email(to);
    }
}

package com.sa.sa.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import com.sa.sa.Models.ContactForm;



@Service
public class ContactService {
    @Autowired
    private JavaMailSender emailSender;


    public void sendEmail(ContactForm contactForm) {


        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("your-email@example.com"); // Change to your email
        message.setSubject(contactForm.getSubject());
        message.setText("Name: " + contactForm.getName() + "\n" +
                "Email: " + contactForm.getEmail() + "\n" +
                "Message: " + contactForm.getMessage());
        emailSender.send(message);
    }
}

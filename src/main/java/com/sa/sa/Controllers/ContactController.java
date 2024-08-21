package com.sa.sa.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.sa.Models.ContactForm;
import com.sa.sa.Services.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping
    public void sendEmail(@RequestBody ContactForm contactForm) {
        contactService.sendEmail(contactForm);
    }
}

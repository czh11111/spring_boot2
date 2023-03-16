package com.example.spring_boot2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class czhService {
    @Autowired
    JavaMailSenderImpl mailSender;

    public void f(String email){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("12");
        mailMessage.setText("11");
        mailMessage.setTo(email);
        mailMessage.setFrom("2986249463@qq.com");
        mailSender.send(mailMessage);
    }

}

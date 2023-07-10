package com.example.spring_boot2.controller;

import com.example.spring_boot2.service.czhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Controller
public class EmailController {
    //@Autowired
    //JavaMailSenderImpl mailSender;

    @Autowired
    czhService czhService;



    @RequestMapping("/simpleEmail")
    public String SimpleEmail(){
        for(int i=0;i<20;i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            czhService.f("2873113013@qq.com");
        }
        return "/index";
    }

    /*@RequestMapping("/complexEmail")
    public String ComplexEmail()throws MessagingException {
        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        //正文
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
        messageHelper.setSubject("12");
        //true 支持html
        messageHelper.setText("<p>123</p>",true);
        //附件
        messageHelper.addAttachment("1.jpg",new File("E:\\java_code\\idea_project\\spring_boot2\\src\\main\\resources\\banner.txt"));
        messageHelper.setTo("2986249463@qq.com");
        messageHelper.setFrom("2986249463@qq.com");
        mailSender.send(mimeMessage);
        return "/index";
    }*/
}

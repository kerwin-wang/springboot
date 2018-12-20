package com.kerwin.springboot.controller;

import com.kerwin.springboot.entity.Mail;
import com.kerwin.springboot.util.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: SendMailController
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-20 9:38
 */
@RestController
@CrossOrigin
public class SendMailController
{
    @Value("${spring.mail.username}")
    private String sendMailName;

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value = "/sendMail")
    public Object sendMail(Mail mail){
        System.out.println(mail.toString());

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(mail.getMailName());
        mailMessage.setSubject(mail.getTitle());
        mailMessage.setText(mail.getContent());
        mailMessage.setFrom(sendMailName);

        mailSender.send(mailMessage);

        JsonBean jsonBean = new JsonBean(true,"1","ok");
        return jsonBean;
    }
}

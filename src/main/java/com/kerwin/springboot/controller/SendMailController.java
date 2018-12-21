package com.kerwin.springboot.controller;

import com.kerwin.springboot.entity.Mail;
import com.kerwin.springboot.util.JsonBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

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
    private static final Logger LOGGER = LoggerFactory.getLogger(SendMailController.class);

    @Value("${spring.mail.username}")
    private String sendMailName;

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value = "/sendMail",method = RequestMethod.POST)
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

    @RequestMapping(value = "/sendHtmlMail",method = RequestMethod.POST)
    public Object sendHtmlMail(Mail mail)
    {
        System.out.println(mail.toString());

        try
        {
            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);

            messageHelper.setFrom(sendMailName);
            messageHelper.setTo(mail.getMailName());
            messageHelper.setSubject(mail.getTitle());
            messageHelper.setText(mail.getContent(),true);

            mailSender.send(message);

            JsonBean jsonBean = new JsonBean(false,"1","发送成功了");
            LOGGER.info("信息发送成功 {}",mail.getMailName());
            return jsonBean;
        }catch (Exception e){
            LOGGER.error("信息发送失败 {}",e.toString());
            return new JsonBean(false,"2","发送失败，清查看日志");
        }
    }
}

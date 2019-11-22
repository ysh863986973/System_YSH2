package com.ysh.user.service.impl;

import com.ysh.user.service.IEmail;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmailImpl implements IEmail {
    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String receiver, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        String mailSender = "1756335900@qq.com";
        //邮件发送人
        simpleMailMessage.setFrom(mailSender);
        //邮件接收人
        simpleMailMessage.setTo(receiver);
        //邮件主题
        simpleMailMessage.setSubject("CSD车速递注册验证码");
        //邮件内容
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);
    }
}

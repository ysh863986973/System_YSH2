package com.ysh.user.service.impl;

import com.ysh.user.dao.IUserDao;
import com.ysh.user.service.pojo.User;
import com.ysh.user.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private IUserDao userDao;

    @Override
    @Transactional
    public int signInService(User user) {

        return userDao.signInDao(user);
    }

    @Override
    @Transactional
    public int updateService(User user) {

        return userDao.updateDao(user);
    }

    @Override
    public List<User> findByIdService(int userId) {
        return userDao.findByIdDao(userId);
    }

    @Override
    public List<User> findByEmailDao(String email) {
        return userDao.findByEmailDao(email);
    }


//    @Override
//    public static boolean emailservice(User user) {
//        ApplicationContext applicationContext;
//        JavaMailSender javaMailSender;
//        String mailSender;
//
//
//
//        applicationContext = new ClassPathXmlApplicationContext("spring-emailservice.xml");
//
//        javaMailSender = (JavaMailSender) applicationContext.getBean("javaMailSender");
//
//        Properties properties = new Properties();
//        // 从配置文件中拿到发件人邮箱地址
//        try {
//            properties.load(UserServiceImpl.class.getResourceAsStream("/mail.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mailSender = properties.getProperty("spring.mail.username");
//
//
//
//        String emailservice = user.getEmail();
//        try {
//            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//            //邮件发送人
//            simpleMailMessage.setFrom(mailSender);
//            //邮件接收人
//            simpleMailMessage.setTo(emailservice);
//            //邮件主题
//            simpleMailMessage.setSubject("测试JavaMail");
//            //邮件内容
//            simpleMailMessage.setText("测试JavaMail");
//            javaMailSender.send(simpleMailMessage);
//        } catch (Exception e) {
//            logger.error("邮件发送失败", e);
//            return false;
//        }
//        return true;
//    }
}

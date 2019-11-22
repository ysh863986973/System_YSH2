package com.ysh.user.view;

import com.ysh.user.service.IEmail;
import com.ysh.user.service.IUserService;
import com.ysh.sys.temppojo.Temp;
import com.ysh.user.service.pojo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller

@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private IUserService userService;

    @Autowired
    private IEmail email;

    @Autowired
    private Temp temp;

    /**
     * 注册方法
     * @param user 666
     * @param session 666
     * @return
     */


    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    @ResponseBody
    public Temp signIn(User user, HttpSession session) {
        Object emailSession = session.getAttribute("emailSession");
        String captcha = String.valueOf(emailSession);

        if (user.getCaptcha().equals(captcha)) {
            int i = userService.signInService(user);

            if (i == 1) {
//                1注册成功
                temp.setCondition("1");
            } else {
//                0注册失败
                temp.setCondition("0");
            }
        } else {
//            2验证码输入错误
            temp.setCondition("2");
        }

        return temp;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Temp update(@RequestParam Map<String, Object> condition, HttpSession session) {
        Object password = condition.get("password");
        User user = (User) session.getAttribute("user");

        user.setPassword(String.valueOf(password));
        int i = userService.updateService(user);

        if(i == 1) {
            temp.setCondition("1");
        } else {
            temp.setCondition("修改失败");
        }

        return temp;
    }

    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
    @ResponseBody
    public Temp send(@RequestParam(value = "email") String receiver, HttpSession session) {
        String content = String.valueOf(((int) ((Math.random() * 9 + 1) * 100000)));

        try {
            session.setAttribute("emailSession", content);
            email.sendEmail(receiver, content);
            temp.setCondition("邮件发送成功");
        } catch (Exception ex) {
            temp.setCondition("邮件发送失败");
        }

        return temp;
    }


//    @RequestMapping("/findById")
//    public String findById(int id) {
//        userService.findByIdService(id);
//
//        return ""
//    }
}

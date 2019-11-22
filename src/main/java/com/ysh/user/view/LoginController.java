package com.ysh.user.view;

import com.ysh.user.service.IUserService;
import com.ysh.user.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    @ResponseBody
    public String login(User user, Model model, HttpSession session) {
        String email = user.getEmail();
        String password = user.getPassword();

        List<User> users = userService.findByEmailDao(email);

        String temp = "0";

        for (User user1 : users) {
            //不用判断email，因为是根据email寻找的值；
            if(user1 != null && user1.getPassword().equals(password)) {
                session.setAttribute("user", user1);
                temp = "1";
            } else {
                model.addAttribute("msg", "账号或密码错误");
            }
        }

        return temp;
    }
}

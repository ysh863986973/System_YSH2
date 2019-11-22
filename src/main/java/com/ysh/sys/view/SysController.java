package com.ysh.sys.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SysController {
    @RequestMapping("/")
    public String index1() {
        return "pagehome/index";
    }

    @RequestMapping("/index")
    public String index2() {
        return "pagehome/index";
    }

    @RequestMapping("/login")
    public String login() {
        return "pagehome/login";
    }

    @RequestMapping("/signIn")
    public String signIn() {
        return "pagehome/signIn";
    }

    @RequestMapping("/shortRent")
    public String shortRent() {
        return "shortrent/shortRent";
    }



    @RequestMapping("/shortSort")
    public String shortSort() {
        return "shortrent/shortSort";
    }

    @RequestMapping("/orderSubmit")
    public String orderSubmit() {
        return "order/orderSubmit";
    }

    @RequestMapping("/myMain")
    public String myMain() {
        return "mymain/myMain";
    }

    @RequestMapping("/myInfo")
    public String myInfo() {
        return "mymain/myInfo";
    }

    @RequestMapping("/updateUser")
    public String updateUser() {
        return "mymain/updateUser";
    }


//    退出登陆
    @RequestMapping("/logoff")
    public String logoff(HttpSession session) {
        session.invalidate();
        return "pagehome/index";
    }

    @RequestMapping("/test")
    public String test() {
        return "pagehome/test1";
    }
}

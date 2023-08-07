package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("register")
    public String register() {
        return "register";
    }

    @RequestMapping("login")
    public String login(@Nullable String refer, Model model, HttpSession session) {
        if (refer != null) {
            model.addAttribute("refer", refer);
        }
        if (session.getAttribute("user") != null) {
            return "redirect:/";
        }
        return "login";
    }
    @RequestMapping("loginIn")
    public String loginIn(String name ,String password , Model model, HttpSession session,String refer){
        User userFromDB = userService.getByNameAndPassword(name,password);
        if(userFromDB == null){
            String msg = "用户名密码错误，请重试";
            model.addAttribute("msg",msg);
            return "login";
        }
        session.setAttribute("user",userFromDB);
        return "redirect:"+refer;
    }

    @RequestMapping("logout")
    public String logout(@Nullable String refer, HttpSession session) {
        session.removeAttribute("user");
        return "redirect:" + refer;
    }

    @RequestMapping("registerAdd")
    public String registerAdd(String name, String password, Model model) throws Exception {
        String msg = null;
        if (!HtmlUtils.htmlEscape(name).equals(name)) {
            msg = "用户名含有特殊字符，无法注册，请重新输入";
        }
        if (userService.getByName(name) != null) {
            msg = "用户名已存在，无法注册，请重新输入";
        }
        if (msg != null) {
            model.addAttribute("msg", msg);
            return "register";
        }

        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setGroup_("user");
        userService.add(user);
        return "registerSuccess";
    }
}

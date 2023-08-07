package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserManageController {
    @Autowired
    private UserService userService;
    //返回所有用户信息
    @RequestMapping("/userManage")
    public String managerUser(HttpServletRequest request,Model model){
        List<User> allUser = userService.getAllUser();
        model.addAttribute("allUser",allUser);
//        request.setAttribute("allUser",allUser);
        return "user_list";
    }
}

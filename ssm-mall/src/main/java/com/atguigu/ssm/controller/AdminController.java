package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @RequestMapping("admin/")
    public String adminPage() {
        return "redirect:/userManage";
    }
    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer id,HttpServletRequest request) {
        userService.deleteUser(id);
        return "redirect:/userManage";
    }
    @RequestMapping("/updateUser/{name}")
    public String updateUser(@PathVariable("name") String name, Model model, HttpServletRequest request) {
        User user = userService.getByName(name);
        model.addAttribute("user",user);
        return "information";
    }
    //修改用户的功能
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String updateUser(Model model, HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String group_ = request.getParameter("group_");
        System.out.println(id + " " +name+" "+password);
        User user = new User(id, name, password, group_);
        userService.save(user);
        return "redirect:/userManage";
    }

}

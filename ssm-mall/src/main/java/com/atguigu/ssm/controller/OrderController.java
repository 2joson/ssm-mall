package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Order;
import com.atguigu.ssm.pojo.Product;
import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.OrderService;
import com.atguigu.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderController {
    List<Product> list = new ArrayList<>();
    @Autowired
    private ProductService productService;
    //将商品添加到订单中
    @RequestMapping("addProduct/{name}")
    public String addProduct(@PathVariable("name") String name ,HttpSession session, Model model)  {
        Product product = productService.getProductByName(name);
        list.add(product);
        session.setAttribute("list",list);
        return "redirect:/search?name=" + name;
    }
    //返回订单中的页面
    @RequestMapping("myOrder")
    public String myOrder()  {
        return "myOrder";
    }
    @RequestMapping("deleteOrder/{count}")
    public String deleteOrder(@PathVariable Integer count,HttpSession session)  {
        List list = (List)session.getAttribute("list");
        list.remove(count);
        session.setAttribute("list",list);
        return "myOrder";
    }

}

package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Product;
import com.atguigu.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductSearchController {
    @Autowired
    private ProductService productService;
    //根据name查询商品信息并添加到域中，返回c查询后的商品信息的视图
    @RequestMapping("search")
    public String search(HttpServletRequest request, Model model) throws Exception {
        String name = request.getParameter("name");
        Product product = productService.getProductByName(name);
        model.addAttribute("product",product);

//        if(keyword.length()==0) {
//            return "search";
//        }
//        List<Product> products = productService
//                .list("name_like",keyword,"order",handleSort(sort),"stock_gt",0);
//        model.addAttribute("products",products);
//        model.addAttribute("keyword",keyword);
        return "search_product";
    }
}

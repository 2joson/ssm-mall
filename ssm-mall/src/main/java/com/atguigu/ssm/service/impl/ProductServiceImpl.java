package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.ProductMapper;
import com.atguigu.ssm.pojo.Product;
import com.atguigu.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Product getProductByName(String name) {
        return productMapper.getProductByName(name);
    }
}

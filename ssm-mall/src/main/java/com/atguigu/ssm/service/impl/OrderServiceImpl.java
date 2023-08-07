package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.pojo.Order;
import com.atguigu.ssm.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> list(String uid, Integer id, String depth, int i) {
        return null;
    }
}

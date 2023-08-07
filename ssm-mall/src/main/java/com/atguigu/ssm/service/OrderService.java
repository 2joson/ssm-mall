package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> list(String uid, Integer id, String depth, int i);
}

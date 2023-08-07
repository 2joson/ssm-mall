package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.UserMapper;
import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public Integer add(User user)  {
        return userMapper.add(user);
    }

    @Override
    public User getByName(String username)  {
        return userMapper.getByName(username);
    }

    @Override
    public User getByNameAndPassword(String name, String password) {
        return userMapper.getByNameAndPassword(name,password);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public Integer save(User user) {
        return userMapper.save(user);
    }
}

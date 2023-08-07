package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.User;

import java.util.List;

public interface UserService {
    /**
     *
     * @param user 从浏览器中获取的原始user
     * @return 添加入库后的行数，该方法会自动对密码进行加密
     */
    public Integer add(User user) ;

    /**
     *
     * @param username 用户名
     * @return 用户名是否存在
     */
    public User getByName(String username) ;

    /**
     *
     * @param name 用户名
     * @param password 密码
     * @return 用户对象
     */
    public User getByNameAndPassword(String name,String password);
    public List<User> getAllUser();
    public Integer deleteUser(Integer id);


    Integer save(User user);
}

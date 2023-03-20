package com.example.springbootpetstore.service;

import com.example.springbootpetstore.dao.UserMapper;
import com.example.springbootpetstore.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-18:42
 */
@Service(value = "UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> QueryAllUsers() {
        return userMapper.QueryAllUsers();
    }
}

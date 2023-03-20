package com.example.springbootpetstore.service;

import com.example.springbootpetstore.pojo.User;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-18:41
 */
public interface UserService {
    List<User> QueryAllUsers();
}

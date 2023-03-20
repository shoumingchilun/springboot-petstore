package com.example.springbootpetstore.dao;

import com.example.springbootpetstore.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-18:08
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> QueryAllUsers();
}

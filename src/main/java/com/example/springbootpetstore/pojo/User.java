package com.example.springbootpetstore.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @auther 齿轮
 * @create 2022-10-26-15:50
 * 用户类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private long userID;
    private String name;
    private String address;
    private String password;
    private String account;
}

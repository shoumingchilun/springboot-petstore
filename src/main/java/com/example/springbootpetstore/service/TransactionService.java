package com.example.springbootpetstore.service;

import com.example.springbootpetstore.pojo.Transaction;
import com.example.springbootpetstore.pojo.User;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-25-0:48
 */
public interface TransactionService {
    //根据userID获得对应用户的Transaction集合
    List<Transaction> getTransactionsByUserID(User user);

    //创建Transaction
    void createTransaction(Transaction transaction);

    //更改指定Transaction的状态
    void updateTransaction(Transaction transaction);
}

package com.example.springbootpetstore.dao;

import com.example.springbootpetstore.pojo.Transaction;
import com.example.springbootpetstore.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-24-22:31
 */
@Mapper
@Repository
public interface TransactionMapper {
    //查询所有订单
    List<Transaction> getAllTransaction();
    //根据userID获得对应用户的Transaction集合
    List<Transaction> getTransactionsByUserID(User user);

    //创建Transaction
    void createTransaction(Transaction transaction);

    //更改指定Transaction的状态
    void updateTransaction(Transaction transaction);

    //删除订单
    void deleteTransaction(Transaction transaction);
}

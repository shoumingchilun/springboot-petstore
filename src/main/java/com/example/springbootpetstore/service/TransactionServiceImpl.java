package com.example.springbootpetstore.service;

import com.example.springbootpetstore.dao.TransactionMapper;
import com.example.springbootpetstore.pojo.Transaction;
import com.example.springbootpetstore.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-25-0:50
 */
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionMapper mapper;

    @Override
    public List<Transaction> getTransactionsByUserID(User user) {
        return mapper.getTransactionsByUserID(user);
    }

    @Override
    public void createTransaction(Transaction transaction) {
        mapper.createTransaction(transaction);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        mapper.updateTransaction(transaction);
    }
}

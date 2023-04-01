package com.example.springbootpetstore;

import com.example.springbootpetstore.pojo.Transaction;
import com.example.springbootpetstore.pojo.User;
import com.example.springbootpetstore.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @auther 齿轮
 * @create 2023-03-25-0:51
 */
@SpringBootTest
public class TransactionServiceTest {
    @Autowired
    TransactionService service;

    @Test
    public void testQuery() {
        User user = new User();
        user.setUserID(0);
        System.out.println(service.getTransactionsByUserID(user));
    }

    @Test
    public void testCreate() {
        Transaction transaction = new Transaction(0, 25, "Noting Noting", "已发货");
        service.createTransaction(transaction);
        System.out.println(transaction);

    }

    @Test
    public void testUpdate(){
        Transaction transaction = new Transaction(15, 0, "Noting Noting???", "已发货");
        service.updateTransaction(transaction);
    }
}

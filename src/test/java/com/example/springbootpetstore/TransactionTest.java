package com.example.springbootpetstore;

import com.example.springbootpetstore.pojo.Transaction;
import com.example.springbootpetstore.pojo.User;
import com.example.springbootpetstore.service.TransactionService;
import com.example.springbootpetstore.service.TransactionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 皮皮皮
 * @date 2023/3/31 13:25
 */
@SpringBootTest
public class TransactionTest {
    @Autowired
    TransactionService transactionService=new TransactionServiceImpl();

    @Test
    public void allTransaction(){
        System.out.println(transactionService.getAllTransaction());
    }

    @Test
    public void allTransactionOfUserIdTest(){
        User user = new User();
        user.setUserID(23);
        System.out.println(transactionService.getTransactionsByUserID(user));
    }
    @Test
    public void updateTransaction(){
        Transaction transaction=new Transaction();
        transaction.setTransactionID(4);
        transaction.setState("已发货");
        transactionService.updateTransaction(transaction);
    }
    @Test
    public void deleteTest(){
        Transaction transaction=new Transaction();
        transaction.setTransactionID(15);
        transactionService.deleteTransaction(transaction);
    }
}

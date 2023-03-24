package com.example.springbootpetstore;

import com.example.springbootpetstore.utils.Hash;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @auther 齿轮
 * @create 2023-03-20-19:48
 */
@SpringBootTest
public class HashTest {
    @Test
    public void test(){
        String s1 = "123123";
        String s2= "123123";
        String s3 = "123456";
        System.out.println(Hash.SHA256Encrypt(s1));
        System.out.println(Hash.SHA256Encrypt(s2));
        System.out.println(Hash.SHA256Encrypt(s3));
    }
}

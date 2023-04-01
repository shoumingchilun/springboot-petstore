package com.example.springbootpetstore.Controller;

import com.example.springbootpetstore.pojo.User;
import com.example.springbootpetstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther 齿轮
 * @create 2023-03-20-17:03
 */
@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    private UserService service;

    @GetMapping("")
    public String toMain(){
        return "main";
    }

    @RequestMapping("/AllUsers")
    @ResponseBody
    public List<User> t() {
        return service.QueryAllUsers();
    }


    @GetMapping("/account")
    public String toAccount(){
        return "productsController/allProducts";
    }

}

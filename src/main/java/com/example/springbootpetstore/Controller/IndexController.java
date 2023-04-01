package com.example.springbootpetstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 皮皮皮
 * @date 2023/3/27 21:03
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String toMain(){
        return "index";
    }
    @RequestMapping("/test")
    public String toTest(){
        return "test";
    }

}

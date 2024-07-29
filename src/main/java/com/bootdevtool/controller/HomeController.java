package com.bootdevtool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        int a = 50;
        int b = 30;
        int c = 10;
        return "sum : "+(a + b + c);
    }
}

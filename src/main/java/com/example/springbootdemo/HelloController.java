package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping(value="hello")
    public String hello(){
        System.out.println();

        return "hello,this is a springboot demo";
    }
}

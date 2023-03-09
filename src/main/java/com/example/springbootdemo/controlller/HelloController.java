package com.example.springbootdemo.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.WebFault;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String  hello(){
        return "Hello Springboot";
    }
}

package com.akim.rest.ws.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akim.rest.ws.restfulwebservices.bean.HelloBean;


@RestController
public class HelloWorldController {
    
    @GetMapping(value="/hello")
    public String getMethodName() {
        return "Hello World";
    }

    @GetMapping(value = "/hello-bean")
    public HelloBean helloBean(){
        return new HelloBean("Hello Bean");
    }
}

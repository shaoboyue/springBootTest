package com.example.springboottest.controller;

import com.example.springboottest.domin.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    DataSource dataSource;
    @GetMapping("hello")
    public String helloWord(){
        return "hello word ! ";
    }
    @RequestMapping(method = RequestMethod.PUT,value = "hello1")
    public String helloWord1(){
        return "hello word ! ";
    }
    @GetMapping("dataSource")
    private DataSource getDataSource(){
        return dataSource;
    }
}

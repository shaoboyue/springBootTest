package com.example.springboottest;

import com.example.springboottest.config.MyConfig01;
import com.example.springboottest.config.MyConfig04;
import com.example.springboottest.domin.Pat;
import com.example.springboottest.domin.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.util.concurrent.atomic.DoubleAdder;

@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootTestApplication.class, args);
        System.out.println(run.getBean("user01"));
    }

}

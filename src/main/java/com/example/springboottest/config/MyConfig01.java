package com.example.springboottest.config;

import com.example.springboottest.domin.Pat;
import com.example.springboottest.domin.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfig01 {
    @Bean("pat")
    public Pat getPat(){
        return new Pat("小狗","欢欢",2);
    }
    @Bean("user")
    public User getUser(){
        return new User("加里奥",28);
    }
}

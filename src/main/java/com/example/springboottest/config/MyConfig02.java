package com.example.springboottest.config;

import com.example.springboottest.domin.Pat;
import com.example.springboottest.domin.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration(proxyBeanMethods = true)
public class MyConfig02 {

    @Bean("root")
    public User getUser(){
        User xiaoming = new User("小明", 18);
        xiaoming.setPat(getPat());//这个组件依赖下面的Pat
        return xiaoming;
    }

    @Bean
    public Pat getPat(){
        return new Pat("奥斯卡","小狗",1);
    }
}

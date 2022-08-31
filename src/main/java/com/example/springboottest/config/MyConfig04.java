package com.example.springboottest.config;

import com.example.springboottest.domin.Pat;
import com.example.springboottest.domin.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@ConditionalOnClass(Pat.class)
//@Import(Pat.class)
//@Configuration()
public class MyConfig04 {
    @Bean("root")
    public User getUser(){
        User xiaoming = new User("小明", 18);
        return xiaoming;
    }
}

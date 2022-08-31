package com.example.springboottest.config;

import com.example.springboottest.domin.Pat;
import com.example.springboottest.domin.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.concurrent.atomic.DoubleAdder;

@Import({User.class, Pat.class, DoubleAdder.class})
//@Configuration
public class MyConfig03 {
}

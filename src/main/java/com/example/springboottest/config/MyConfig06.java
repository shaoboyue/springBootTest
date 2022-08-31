package com.example.springboottest.config;

import com.example.springboottest.domin.DataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DataSource.class)
public class MyConfig06 {
}

package com.bar.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean
    public Hello getHelloBean() {
        return new HelloImpl();

    }

}

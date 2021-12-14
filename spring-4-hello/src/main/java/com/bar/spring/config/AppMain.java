package com.bar.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Start");
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello bean = ctx.getBean(Hello.class);
        bean.saySomething();

    }
}

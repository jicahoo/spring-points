package com.bar.spring.config;

public class HelloImpl implements Hello{

    public HelloImpl() {
        //Simluate an error

    }
    @Override
    public void saySomething() {
        System.out.println("Hello Spring 4!");
    }
}

package com.ganga.proxy.cglib;

public class MyAdvice {

    public void before(){
        System.out.println("前置增强...");
    }

    public void after(){
        System.out.println("后置增强...");
    }

}

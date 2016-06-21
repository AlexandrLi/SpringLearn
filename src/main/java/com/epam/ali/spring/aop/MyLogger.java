package com.epam.ali.spring.aop;

import javax.inject.Named;

@Named
public class MyLogger {

    public void printValue(Object value) {
        System.out.println(value);
    }

    public void init() {
        System.out.println("init");
    }

    public void close() {
        System.out.println("close");
    }
}

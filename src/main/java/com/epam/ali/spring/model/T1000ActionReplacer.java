package com.epam.ali.spring.model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class T1000ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("T1000 action replacer is on!");
        return null;
    }
}

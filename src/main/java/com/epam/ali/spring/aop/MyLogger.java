package com.epam.ali.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import javax.inject.Named;
import java.util.Map;
import java.util.Set;

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

    public Object watchTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Begin method " + joinPoint.getSignature().toShortString());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("Path: " + arg);
        }
        Object output = joinPoint.proceed();
        print(output);
        long time = System.currentTimeMillis() - start;
        System.out.println("End method " + joinPoint.getSignature().toShortString() + " time = " + time + " ms");
        return output;
    }

    private void print(Object collection) {
        if (collection instanceof Set) {
            ((Set) collection).forEach(System.out::println);
        } else if (collection instanceof Map) {
            ((Map) collection).forEach((o, o2) -> System.out.println("key: " + o + " value: " + o2));
        }
    }
}

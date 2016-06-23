package com.epam.ali.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import javax.inject.Named;
import java.util.Map;
import java.util.Set;

@Named
@Aspect
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

    @Around("@annotation(com.epam.ali.spring.aop.CheckTime)")
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

    @AfterReturning(pointcut = "@annotation(ShowResult)", returning = "object")
    private void print(Object object) {
        if (object instanceof Set) {
            ((Set) object).forEach(System.out::println);
        } else if (object instanceof Map) {
            ((Map) object).forEach((o, o2) -> System.out.println("key: " + o + " value: " + o2));
        } else {
            System.out.println(object);
        }
    }
}

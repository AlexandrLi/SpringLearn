package com.epam.ali.spring.aop;

import javax.inject.Named;

@Named
public class SomeService {

    public int getIntValue() {
        return 5;
    }

    public double getDoubleValue() {
        return 5.6;
    }
}

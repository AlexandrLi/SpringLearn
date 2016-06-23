package com.epam.ali.spring.aop;

import javax.inject.Named;

@Named
public class SomeService {

    @ShowResult
    public int getIntValue() {
        return 5;
    }

    @ShowResult
    public double getDoubleValue() {
        return 5.6;
    }
}

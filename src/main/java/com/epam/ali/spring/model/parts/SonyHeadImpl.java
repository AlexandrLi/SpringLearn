package com.epam.ali.spring.model.parts;

import javax.inject.Named;

@Named("sonyHead")
public class SonyHeadImpl implements Head {

    @Override
    public void calc() {
        System.out.println("Sony calculating...");
    }
}

package com.epam.ali.spring.model.parts;

import javax.inject.Named;

@Named("lgHead")
public class LgHeadImpl implements Head {

    @Override
    public void calc() {
        System.out.println("LG calculating...");
    }
}

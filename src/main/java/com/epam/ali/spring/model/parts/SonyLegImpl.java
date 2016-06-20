package com.epam.ali.spring.model.parts;

import javax.inject.Named;

@Named("sonyLeg")
public class SonyLegImpl implements Leg {

    @Override
    public void go() {
        System.out.println("Going to Sony office");
    }
}

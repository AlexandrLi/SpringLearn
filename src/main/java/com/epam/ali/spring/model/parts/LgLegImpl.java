package com.epam.ali.spring.model.parts;

import javax.inject.Named;

@Named("lgLeg")
public class LgLegImpl implements Leg {

    @Override
    public void go() {
        System.out.println("Going to good life");
    }
}

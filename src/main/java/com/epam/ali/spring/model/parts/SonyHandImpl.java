package com.epam.ali.spring.model.parts;

import javax.inject.Named;

@Named("sonyHand")
public class SonyHandImpl implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catching Sony walkman");
    }

}

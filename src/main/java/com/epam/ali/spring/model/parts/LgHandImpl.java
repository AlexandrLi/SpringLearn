package com.epam.ali.spring.model.parts;

import javax.inject.Named;

@Named("lgHand")
public class LgHandImpl implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catching LG G5");
    }

}

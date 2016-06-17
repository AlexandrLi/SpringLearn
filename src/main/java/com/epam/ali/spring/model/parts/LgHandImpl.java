package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lgHand")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LgHandImpl implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catching LG G5");
    }

}

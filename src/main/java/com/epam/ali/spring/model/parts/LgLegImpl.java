package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lgLeg")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LgLegImpl implements Leg {

    @Override
    public void go() {
        System.out.println("Going to good life");
    }
}

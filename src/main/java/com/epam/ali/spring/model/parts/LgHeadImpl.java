package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lgHead")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LgHeadImpl implements Head {
    @Override
    public void calc() {
        System.out.println("LG calculating...");
    }
}

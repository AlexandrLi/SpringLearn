package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SonyLegImpl implements Leg {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SonyLegImpl sonyLeg() {
        return new SonyLegImpl();
    }

    @Override
    public void go() {
        System.out.println("Going to Sony office");
    }
}

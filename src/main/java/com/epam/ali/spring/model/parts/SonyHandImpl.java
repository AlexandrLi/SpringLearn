package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SonyHandImpl implements Hand {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SonyHandImpl sonyHand() {
        return new SonyHandImpl();
    }

    @Override
    public void catchSomething() {
        System.out.println("Catching Sony walkman");
    }

}

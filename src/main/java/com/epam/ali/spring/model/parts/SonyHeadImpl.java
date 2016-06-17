package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SonyHeadImpl implements Head {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SonyHeadImpl sonyHead() {
        return new SonyHeadImpl();
    }

    @Override
    public void calc() {
        System.out.println("Sony calculating...");
    }
}

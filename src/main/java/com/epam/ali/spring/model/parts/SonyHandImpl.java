package com.epam.ali.spring.model.parts;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SonyHandImpl implements Hand, InitializingBean, DisposableBean {

    @Override
    public void catchSomething() {
        System.out.println("Catching Sony walkman");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy SonyHand using DisposableBean interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init SonyHand using InitializingBean interface");
    }
}

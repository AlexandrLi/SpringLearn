package com.epam.ali;

import com.epam.ali.spring.aop.FileManager;
import com.epam.ali.spring.aop.SomeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLearnApplicationTests {

    @Test
    public void contextLoads() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("App-context.xml");
        SomeService someService = context.getBean("someService", SomeService.class);
        someService.getDoubleValue();
        someService.getIntValue();
        FileManager fileManager = context.getBean("fileManager", FileManager.class);
        fileManager.getExtensionList("C:\\Windows\\System32");
        fileManager.getExtensionCount("C:\\Windows\\System32");
    }
}

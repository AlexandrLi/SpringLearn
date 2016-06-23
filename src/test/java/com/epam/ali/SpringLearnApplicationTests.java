package com.epam.ali;

import com.epam.ali.spring.aop.FileManager;
import com.epam.ali.spring.aop.SomeService;
import com.epam.ali.spring.model.robot.ModelT1000;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLearnApplicationTests {

    @Test
    public void contextLoads() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("App-context.xml");
        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
        t1000.action();
        t1000 = null;
        SomeService someService = context.getBean("someService", SomeService.class);
        someService.getDoubleValue();
        someService.getIntValue();
        FileManager fileManager = context.getBean("fileManager", FileManager.class);
        fileManager.getExtensionList("C:\\Windows\\System32");
        fileManager.getExtensionCount("C:\\Windows\\System32");
    }
}

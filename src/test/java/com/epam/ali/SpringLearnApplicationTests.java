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
        FileManager fileManager = context.getBean("fileManager", FileManager.class);
        someService.getDoubleValue();
        someService.getIntValue();
        fileManager.getExtensionList("C:\\Windows\\System32");
        fileManager.getExtensionCount("C:\\Windows\\System32");
//        T1000Pool t1000Pool = context.getBean("t1000Pool", T1000Pool.class);
//        t1000Pool.action();
//        T1000Pool t1000FilteredPool = context.getBean("t1000FilteredPool", T1000Pool.class);
//        t1000FilteredPool.action();
    }

}

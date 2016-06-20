package com.epam.ali;

import com.epam.ali.spring.SpringLearnApplication;
import com.epam.ali.spring.model.robot.ModelT1000;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringLearnApplication.class)
public class SpringLearnApplicationTests {

    @Test
    public void contextLoads() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("App-context.xml");
        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
        t1000.action();
        t1000 = null;
    }

}

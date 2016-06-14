package com.epam.ali;

import com.epam.ali.spring.model.Robot;
import com.epam.ali.spring.model.T1000Conveyor;
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
        T1000Conveyor t1000Conveyor = context.getBean("t1000Conveyor", T1000Conveyor.class);
        Robot robot1 = t1000Conveyor.createRobot();
        robot1.action();
        Robot robot2 = t1000Conveyor.createRobot();
        robot2.action();
//        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
//        t1000.action();
    }

}

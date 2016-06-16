package com.epam.ali;

import com.epam.ali.spring.SpringLearnApplication;
import com.epam.ali.spring.model.T1000Pool;
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
        T1000Pool t1000Pool = context.getBean("t1000Pool", T1000Pool.class);
        t1000Pool.action();
        T1000Pool t1000FilteredPool = context.getBean("t1000FilteredPool", T1000Pool.class);
        t1000FilteredPool.action();
    }

}

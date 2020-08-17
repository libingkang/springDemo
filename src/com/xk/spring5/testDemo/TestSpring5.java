package com.xk.spring5.testDemo;

import com.xk.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void add(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        user.add();
    }
}

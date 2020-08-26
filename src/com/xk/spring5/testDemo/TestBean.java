package com.xk.spring5.testDemo;

import com.xk.spring5.pojo.Book;
import com.xk.spring5.pojo.Person;
import com.xk.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void add(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.addUser();
    }


}

package com.xk.spring5.testDemo;

import com.xk.spring5.User;
import com.xk.spring5.pojo.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void add(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = classPathXmlApplicationContext.getBean("book", Book.class);
        System.out.println(book.getName() + "," + book.getDesc());
    }
}

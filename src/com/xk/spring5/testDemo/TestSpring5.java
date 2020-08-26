package com.xk.spring5.testDemo;

import com.xk.spring5.User;
import com.xk.spring5.pojo.Book;
import com.xk.spring5.pojo.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSpring5 {
    @Test
    public void add(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Person book = classPathXmlApplicationContext.getBean("person", Person.class);
        System.out.println(book.getName() + "," + book.getAge());
    }

    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = classPathXmlApplicationContext.getBean("book1", Book.class);
        System.out.println(book.getName() + "," + book.getDesc());
    }

    @Test
    public void testNullDI(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = classPathXmlApplicationContext.getBean("book2", Book.class);
        System.out.println(book.getName() + "," + book.getDesc() + "," + book.getPrice());
    }

    @Test
    public void testListDI(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        Person person = classPathXmlApplicationContext.getBean("list", Person.class);
        System.out.println(person.getName() + "," + person.getAge() + "," + person.getHobby() + "," + person.getBookList().get(0).getName());
    }


}

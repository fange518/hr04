package com.hr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    public static void main(String[] args) {
//        Hello hello = new Hello();
//        hello.setName("spring");
//        hello.print();


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.print();
    }
}
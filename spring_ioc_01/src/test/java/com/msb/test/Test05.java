package com.msb.test;

import com.msb.bean.Book;
import com.msb.bean.BookFactory;
import com.msb.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void testGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Book book = context.getBean("bookFactory", Book.class);
        System.out.println(book);

    }

}

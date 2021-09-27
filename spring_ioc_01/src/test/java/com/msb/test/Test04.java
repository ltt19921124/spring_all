package com.msb.test;

import com.msb.bean.Cat;
import com.msb.bean.Mouse;
import com.msb.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void testGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1.getBooks());
        System.out.println(student1.getBookSet());
        System.out.println(student1.getBookMap());
        System.out.println(student1.getBookList2());


    }

}

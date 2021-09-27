package com.msb.test;

import com.msb.bean.Cat;
import com.msb.bean.Mouse;
import com.msb.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    @Test
    public void testGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Mouse mouse1 = context.getBean("mouse1", Mouse.class);

        System.out.println(mouse1);

        Cat cat1 = context.getBean("cat1", Cat.class);
        System.out.println(cat1);

        Cat cat2 = context.getBean("cat2", Cat.class);
        System.out.println(cat2);

    }

}

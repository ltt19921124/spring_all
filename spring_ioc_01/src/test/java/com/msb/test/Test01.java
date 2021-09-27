package com.msb.test;

import com.msb.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user1 = context.getBean("user1", User.class);
//        System.out.println(user1);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);

        User user3 = context.getBean("user3", User.class);
        System.out.println(user3);

        User user4 = context.getBean("user4", User.class);
        System.out.println(user4);

        User user5 = context.getBean("user5", User.class);
        System.out.println(user5);

    }

}

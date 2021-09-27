package com.msb.test;

import com.msb.bean.Book;
import com.msb.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    @Test
    public void testGetBean() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        User user = context.getBean("user", User.class);
        System.out.println("第四步：User 获取");
//        System.out.println(user);
        //关闭容器
        context.close();


    }

}

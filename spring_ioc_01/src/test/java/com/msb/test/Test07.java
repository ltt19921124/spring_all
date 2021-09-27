package com.msb.test;

import com.msb.bean.Emp;
import com.msb.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {
    @Test
    public void testGetBean() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }

}

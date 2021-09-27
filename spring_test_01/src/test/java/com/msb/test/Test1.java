package com.msb.test;

import com.msb.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void testGetBean() {
        //获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmpDao empDao = (EmpDao) context.getBean("empDao");
        empDao.addEmp();

    }

}

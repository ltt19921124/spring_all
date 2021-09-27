package com.msb.test;

import com.msb.pojo.Emp;
import com.msb.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Test1 {
    @Test
    public void testEmpService() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = context.getBean(EmpService.class);
//        int empCount = empService.findEmpCount();
//        System.out.println(empCount);

        /*Emp emp = empService.findByEmpno(7876);
        System.out.println(emp);*/

        List<Emp> byDeptno = empService.findByDeptno(20);
        for (Emp emp : byDeptno) {
            System.out.println(emp);
        }

    }

}


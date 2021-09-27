package com.msb.test;

import com.msb.pojo.Dept;
import com.msb.pojo.Emp;
import com.msb.service.DeptService;
import com.msb.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test2 {
    @Test
    public void testEmpService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = context.getBean(DeptService.class);
        List<Dept> depts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            depts.add(new Dept(null,"name" + i,"loc" + i));
        }
        int[] ints = deptService.deptBatchAdd(depts);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void testBatchUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = context.getBean(DeptService.class);
        List<Dept> depts = new ArrayList<>();
        for (int i = 70; i < 80; i++) {
            depts.add(new Dept(i,"newname" + i,"newloc"));
        }
        int[] ints = deptService.deptBatchAdd(depts);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void testBatchDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = context.getBean(DeptService.class);
        List<Integer> deptnos = new ArrayList<>();
        for (int i = 44; i < 63; i++) {
            deptnos.add(i);
        }
        int[] ints = deptService.deptBatchDelete(deptnos);
        System.out.println(Arrays.toString(ints));
    }

}


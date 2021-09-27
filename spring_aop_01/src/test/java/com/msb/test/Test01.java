package com.msb.test;

import com.msb.dao.EmpDao;
import com.msb.dao.UserDao;
import com.msb.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void getBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService user = context.getBean(UserService.class);
//        user.addUser(1,"zhangsN");
//        UserDao userDao = context.getBean(UserDao.class);
//        userDao.addUser(1,"zhangsan");
//        System.out.println(userDao.getClass().getSimpleName());
//        int rows = userDao.addUser(1,"zhangsan");
//        System.out.println(rows);

        EmpDao empDao = context.getBean(EmpDao.class);
        empDao.addEmp(10,"Tom","SalesMAN");


    }


}

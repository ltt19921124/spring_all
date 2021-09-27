package com.msb.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.msb.bean.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class Test08 {
    @Test
    public void testGetBean() throws SQLException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();

    }

}

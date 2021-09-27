package com.msb.dao.impl;

import com.msb.dao.EmpDao;
import com.msb.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findEmpCount() {
        String sql = "select count(1) from emp";
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    @Override
    public Emp findByEmpno(int empno) {
        String sql = "select * from emp where empno =?";
        BeanPropertyRowMapper<Emp> rowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);

        Emp emp = jdbcTemplate.queryForObject(sql, rowMapper, empno);
//        System.out.println(emp);
        return emp;
    }

    @Override
    public List<Emp> findByDeptno(int deptno) {
        /**
         *
         *
         */
        String sql ="select * from emp where deptno=?";
        BeanPropertyRowMapper<Emp> rowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);

        List<Emp> emps = jdbcTemplate.query(sql, rowMapper, deptno);
        return emps;
    }
}

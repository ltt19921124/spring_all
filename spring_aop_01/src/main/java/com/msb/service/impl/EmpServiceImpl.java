package com.msb.service.impl;

import com.msb.dao.EmpDao;
import com.msb.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements Empservice {

    @Autowired
    private EmpDao empDao;
    @Override
    public int addEmp(int empno, String ename, String job) {
        System.out.println("empService add ... ...");
        return 1;
    }

}

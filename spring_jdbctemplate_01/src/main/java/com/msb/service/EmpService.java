package com.msb.service;

import com.msb.pojo.Emp;

import java.util.List;

public interface EmpService {

    int findEmpCount();

    Emp findByEmpno(int empno);

    List<Emp> findByDeptno(int deptno);

}

package com.msb.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class DaoAspect2 {

    //定义一个公共切点
    @Pointcut("execution(* com.msb.dao.*.add*(..))")
    public void addPointCut() {

    }

    @Before("addPointCut()")
    public void methodBefore(JoinPoint joinPoint) {
        System.out.println("methodBefore2 invoked.....");
        Object[] args = joinPoint.getArgs();
        System.out.println("args:" + Arrays.toString(args));
    }

    @After("execution(* com.msb.dao.impl.UserDaoImpl.addUser(..))")
    public void methodAfter(JoinPoint joinPoint){
        System.out.println("methodAfter2 invoked");
    }

    @AfterReturning(value = "execution(* com.msb.dao.impl.UserDaoImpl.addUser(..))",returning = "res")
    public void methodAfterReturning(JoinPoint joinPoint,Object res) {
        System.out.println("methodAfterReturning2 invoked...");
        System.out.println(res);
    }

    @AfterThrowing(value = "execution(* com.msb.dao.impl.UserDaoImpl.addUser(..))",throwing ="ex")
    public void methodAfterThrowing(Exception ex) {
        System.out.println("methodAfterThrowing2 invoked......");
        System.out.println(ex.getMessage());
    }

    @Around("execution(* com.msb.dao.impl.UserDaoImpl.addUser(..))")
    public Object methodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("methodAroundA invoked...");
        Object res = proceedingJoinPoint.proceed();
        System.out.println("methodAroundB invoked...");
        return res;
    }


}

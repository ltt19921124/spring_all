package com.msb.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

//        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
        System.out.println("bean:初始化方法之前");
        return bean;

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
        System.out.println("bean:初始化bean之后");
        return bean;
    }
}

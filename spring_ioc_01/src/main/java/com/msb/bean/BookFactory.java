package com.msb.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {

    /*public Book getBook(){
        Book book = new Book();
        book.setBname("JAVA");
        book.setAuthor("马士兵");
        return book;
    }*/

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBname("JAVA");
        book.setAuthor("马士兵");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}

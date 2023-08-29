package com.example.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("Bean.xml");
        Collection c=(Collection)context1.getBean("collection");

        c.getAddressList();
        c.getAddressSet();
        c.getAddressMap();
        c.getAddressProp();
    }
}

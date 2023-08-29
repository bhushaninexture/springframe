package com.example.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student st = (Student) context.getBean("s");

        System.out.println("Student name -" +  st.getName());
        Address address = st.getAddress();
        if (address != null) {
            String city = address.getCity();
            if (city != null && !city.trim().isEmpty()) {
                System.out.println("Student city: " + city);
            }
        }


    }

}
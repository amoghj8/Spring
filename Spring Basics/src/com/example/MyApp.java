package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ajoshi on 20/02/19.
 */
public class MyApp {

    public static void main(String args[]) {

        // Load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bean
        Organization theOrg = context.getBean("QE", Organization.class);

        Organization secondOrg = context.getBean("QE", Organization.class);

        // Call methods on the object
        System.out.println(theOrg.getDesignation());

        System.out.println(theOrg.getWork());

        System.out.println(theOrg + " , " + secondOrg );

        // Close the context
        context.close();
    }
}

package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ajoshi on 25/02/19.
 */
public class ManagerConfigDemo {

    public static void main(String args[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve the bean
        Manager theOrg = context.getBean("manager", Manager.class);


        // Call methods on the object
        System.out.println(theOrg.getDesignation());

        System.out.println(theOrg.getWork());

        System.out.println(theOrg.getTeam());

        System.out.println(theOrg.getEmail());

        // Close the context
        context.close();

    }
}

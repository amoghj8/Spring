package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ajoshi on 25/02/19.
 */
public class JavaConfigDemo {

    public static void main(String args[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve the bean
        Organization theOrg = context.getBean("QE", Organization.class);

        Organization secondOrg = context.getBean("QE", Organization.class);

        // Call methods on the object
        System.out.println(theOrg.getDesignation());

        System.out.println(theOrg.getWork());

        System.out.println(theOrg + " , " + secondOrg);

        // Close the context
        context.close();

    }
}

package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by ajoshi on 25/02/19.
 */

@Configuration
@PropertySource("job.properties")
//@ComponentScan("com.example")
public class SportConfig {


    // Define bean for DebtWork
    @Bean
    public Work debtWork() {
        return new DebtWork();
    }


    // Define bean for manager and inject the dependency
    @Bean
    public Organization manager() {
        return new Manager(debtWork());
    }



}

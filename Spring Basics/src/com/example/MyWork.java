package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by ajoshi on 25/02/19.
 */

@Component
public class MyWork implements Work {
    @Override
    public String getWork() {
        return "Code";
    }
}

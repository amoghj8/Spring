package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ajoshi on 20/02/19.
 */

@Component
@Scope("prototype")
public class QE implements Organization {

    @Autowired
    private Work work;

    public QE() {
        System.out.println("Inside QE constructor");
    }

    @Override
    public String getWork(){
        return work.getWork();
    }

    @Override
    public String getDesignation() {
        return "Inside get Designation";
    }
}

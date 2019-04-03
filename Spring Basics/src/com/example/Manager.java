package com.example;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ajoshi on 25/02/19.
 */
public class Manager implements Organization {

    private Work work;

    @Value("${foo.email}")
    String email;

    @Value("${foo.team}")
    String team;

    public Manager(Work work) {
        this.work = work;
    }

    @Override
    public String getDesignation() {
        return "Oversee";
    }

    @Override
    public String getWork() {
        return work.getWork();
    }

    public String getEmail() {
        return this.email;
    }

    public String getTeam() {
        return this.team;
    }
}

package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by ajoshi on 26/03/19.
 */
@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World, time on the server is " + LocalDate.now();
    }

    @GetMapping("/workout")
    public String sayWorkout() {
        return "Cardio a must";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }

    @GetMapping("/teamtalk")
    public String getTeamTalk() {
        return "Coach " + coachName + " asks team " + teamName + " to play hard";
    }
}

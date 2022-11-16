package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class FighterCoach implements Coach

{
    @Value("${ufc.name}")
    private String name;
    @Value("${ufc.lastname}")
    private String lastname;
    @Value("${ufc.nationality}")
    private String nationality;
    @Value("${ufc.height}")
    private int height;
    @Value("${ufc.weight}")
    private int weight;

    private FortuneService fortuneService;

    public FighterCoach (FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "90 min cardio\n100 pushups\n100 pullups";
    }

    @Override
    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNationality() {
        return nationality;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

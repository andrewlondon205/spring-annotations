package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UfcTrainer implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Stipe does hundreds of pull ups per day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

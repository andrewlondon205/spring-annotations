package com.luv2code.springdemo;

import java.io.IOException;

public class SwimCoach implements Coach

{
    private FortuneService fortuneService;
    public SwimCoach (FortuneService theFortuneService) { fortuneService = theFortuneService; }

    @Override
    public String getDailyWorkout()
    {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() throws IOException
    {
        return fortuneService.getFortune();
    }
}

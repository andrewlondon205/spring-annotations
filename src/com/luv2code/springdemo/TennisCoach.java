package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("compScienceFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach () {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff () {
        System.out.println(">>TennisCoach: inside of doMyStartupStuff()");
    }
    // define my destroy code
    @PreDestroy
    public void doMyCleanupStuff () {
        System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
    }

/*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }
*/

    // define a setter method

/*    @Autowired
    public void setFortuneService (FortuneService theFortuneService) {
        System.out.println(">> TennisCoach:  inside setfortuneService() method");
        fortuneService = theFortuneService;
    }*/

/*    @Autowired
    public TennisCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}

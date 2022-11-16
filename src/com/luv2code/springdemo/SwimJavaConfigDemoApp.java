package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) throws IOException {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
        //Coach ufcCoach = context.getBean("ufcTrainer",Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(ufcCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //call our new swim coach methods ... has the props values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // close the context
        context.close();
    }
}

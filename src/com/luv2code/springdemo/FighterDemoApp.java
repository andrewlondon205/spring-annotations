package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class FighterDemoApp
{

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FighterConfigApp.class);

        FighterCoach theCoach = context.getBean("fighterCoach",FighterCoach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        System.out.println("Name: " + theCoach.getName());
        System.out.println("LastName: " + theCoach.getLastname());
        System.out.println("Nationality: " + theCoach.getNationality());
        System.out.println("Height: "+ theCoach.getHeight());
        System.out.println("Weight: " + theCoach.getWeight());

        context.close();

    }
}

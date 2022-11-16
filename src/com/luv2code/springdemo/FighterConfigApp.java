package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:fighter.properties")
public class FighterConfigApp

{
    @Bean
    public FortuneService fighterFortununeService () {return new FitnessFortuneService ();}

    @Bean
    public Coach fighterCoach () {return new FighterCoach(fighterFortununeService()); }

}

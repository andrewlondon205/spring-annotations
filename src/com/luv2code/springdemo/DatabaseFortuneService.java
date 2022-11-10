package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DatabaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "SQL Database";
    }

}

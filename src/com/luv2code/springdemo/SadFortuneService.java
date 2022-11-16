package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class SadFortuneService implements FortuneService

{
    @Override
    public String getFortune() throws IOException {
        return "Today is a sad day";
    }
}

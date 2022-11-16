package com.luv2code.springdemo;

import java.io.IOException;

public class SadFortuneService implements FortuneService

{

    @Override
    public String getFortune() throws IOException {
        return "Today is a sad day";
    }
}

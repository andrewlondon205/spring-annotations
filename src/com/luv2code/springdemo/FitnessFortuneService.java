package com.luv2code.springdemo;

import java.io.IOException;

public class FitnessFortuneService implements FortuneService

{
    @Override
    public String getFortune() throws IOException
    {
        return "You will lose 20 kg in 3 months time";
    }
}

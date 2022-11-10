package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private List<String> info =
            List.of("Beware of the wolf in sheep's clothing",
                    "Diligence is the mother of good luck",
                    "The journey is the reward");

    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        int rand = myRandom.nextInt(info.size());
        return info.get(rand);
    }

}

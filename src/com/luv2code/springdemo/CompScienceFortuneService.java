package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CompScienceFortuneService implements FortuneService {

    private List<String> items = new ArrayList<>();
    @PostConstruct
    public String getRandomFortune() throws IOException {

        System.out.println("Inside the GetRandomFortune annotated with @PostConstruct");

        Path content = Path.of("words.txt");
        String words = Files.readString(content);
        String [] devfortune = words.split(",");
        for (String w : devfortune) {
            items.add(w);
        }

        Random rand = new Random();
        int randint = rand.nextInt(items.size());
        return items.get(randint);
    }

    @Override
    public String getFortune() throws IOException {
        return getRandomFortune();
    }
}

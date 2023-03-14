package com.example.demo.service;

import com.example.demo.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HelloQueryService {
    private final Hello helloModel;
    @Autowired
    public HelloQueryService(Hello helloModel) {
        this.helloModel = helloModel;
    }

    public String generateRandomQuote() {
        String[] quoteList = helloModel.getRandomQuote();

        return quoteList[new Random().nextInt(quoteList.length)];
    }

}

package com.Lucas.aprendendo_spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String nome) {
        return "Hello World " + nome ;
    }
}

package com.Lucas.aprendendo_spring.controller;

import com.Lucas.aprendendo_spring.domain.User;
import com.Lucas.aprendendo_spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Lucas");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body) {
        return "Hello World Post " + body.getNome() + " " + id;
    }

}

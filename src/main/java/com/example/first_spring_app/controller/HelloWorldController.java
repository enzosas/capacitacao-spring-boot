package com.example.first_spring_app.controller;


import com.example.first_spring_app.domain.User;
import com.example.first_spring_app.service.HelloWorldService;
import com.example.first_spring_app.service.SomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("enzo");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body) {
        return "Hello World post " + body.getNome() + " path: " + id;
    }

}

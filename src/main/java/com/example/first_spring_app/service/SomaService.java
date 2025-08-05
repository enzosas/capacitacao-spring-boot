package com.example.first_spring_app.service;


import org.springframework.stereotype.Service;

@Service
public class SomaService {
    public Integer soma(int a, int b) {
        return a + b;
    }
}

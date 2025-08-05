package com.example.first_spring_app.service;


import org.springframework.stereotype.Service;

@Service
public class SubtracaoService {
    public Integer subtracao(int a, int b) {
        return a - b;
    }
}

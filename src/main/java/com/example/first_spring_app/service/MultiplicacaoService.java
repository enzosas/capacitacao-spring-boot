package com.example.first_spring_app.service;


import org.springframework.stereotype.Service;

@Service
public class MultiplicacaoService {
    public Integer multiplicacao(int a, int b) {
        return a * b;
    }
}

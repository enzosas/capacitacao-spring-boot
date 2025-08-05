package com.example.first_spring_app.controller;

import com.example.first_spring_app.service.MultiplicacaoService;
import com.example.first_spring_app.service.SomaService;
import com.example.first_spring_app.service.SubtracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    private SomaService somaService;

    @Autowired
    private SubtracaoService subtracaoService;

    @Autowired
    private MultiplicacaoService multiplicacaoService;

    @GetMapping("/")
    public String helloWorld() {
        return "Bem-vindo à pior calculadora da historia! <br>Operadores: /soma , /subtracao <br>Use por exemplo: /subtracao?a=5&b=3 para subtrair.";
    }

    @GetMapping("/soma")
    public String soma(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(somaService.soma(a, b));
    }

    @GetMapping("/subtracao")
    public String subtracao(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(subtracaoService.subtracao(a, b));
    }

    @GetMapping("/multiplicacao")
    public String multiplicacao(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(multiplicacaoService.multiplicacao(a, b));
    }
}

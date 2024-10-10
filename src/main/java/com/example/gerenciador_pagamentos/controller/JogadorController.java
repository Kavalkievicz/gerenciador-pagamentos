package com.example.gerenciador_pagamentos.controller;

import com.example.gerenciador_pagamentos.model.Jogador;
import com.example.gerenciador_pagamentos.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")  // Alterado para /api/jogadores
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @GetMapping
    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    @PostMapping
    public Jogador createJogador(@RequestBody Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
}

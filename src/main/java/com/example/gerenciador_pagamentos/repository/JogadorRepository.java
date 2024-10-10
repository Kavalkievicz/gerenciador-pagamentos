package com.example.gerenciador_pagamentos.repository;

import com.example.gerenciador_pagamentos.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
}
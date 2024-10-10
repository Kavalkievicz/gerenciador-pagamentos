package com.example.gerenciador_pagamentos.repository;

import com.example.gerenciador_pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    // Método para buscar todos os pagamentos de um jogador específico
    List<Pagamento> findByJogadorCodJogador(Integer jogadorId);
}
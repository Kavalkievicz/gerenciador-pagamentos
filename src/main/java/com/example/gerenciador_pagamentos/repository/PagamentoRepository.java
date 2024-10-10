package com.example.gerenciador_pagamentos.repository;

import com.example.gerenciador_pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    List<Pagamento> findByJogadorCodJogador(Integer jogadorId);
}
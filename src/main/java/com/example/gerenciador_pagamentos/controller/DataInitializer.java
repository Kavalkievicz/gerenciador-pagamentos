package com.example.gerenciador_pagamentos.controller;

import com.example.gerenciador_pagamentos.model.Jogador;
import com.example.gerenciador_pagamentos.model.Pagamento;
import com.example.gerenciador_pagamentos.repository.JogadorRepository;
import com.example.gerenciador_pagamentos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    public void run(String... args) throws Exception {
        Jogador jogador1 = new Jogador("João Pedro K.", "joao@gmail.com", LocalDate.of(2003, 9, 15));
        Jogador jogador2 = new Jogador("Wesley Godk", "wvgodk@gmail.com", LocalDate.of(1998, 2, 17));
        Jogador jogador3 = new Jogador("Pedro Lima", "pedro@gmail.com", LocalDate.of(1992, 12, 20));

        jogadorRepository.saveAll(List.of(jogador1, jogador2, jogador3));

        criarPagamentos(jogador1);
        criarPagamentos(jogador2);
        criarPagamentos(jogador3);
    }

    private void criarPagamentos(Jogador jogador) {
        Pagamento pagamento1 = new Pagamento((short) 2024, (byte) 1, 350.00, jogador);

        pagamentoRepository.saveAll(List.of(pagamento1));
    }
}
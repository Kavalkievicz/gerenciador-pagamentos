package com.example.gerenciador_pagamentos.controller;

import com.example.gerenciador_pagamentos.model.Jogador;
import com.example.gerenciador_pagamentos.model.Pagamento;
import com.example.gerenciador_pagamentos.repository.JogadorRepository;
import com.example.gerenciador_pagamentos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping("/jogadores")
    public String getJogadores(Model model) {
        List<Jogador> jogadores = jogadorRepository.findAll();
        model.addAttribute("jogadores", jogadores);

        return "jogadores";
    }

    @GetMapping("/pagamentos")
    public String getPagamentos(Model model) {
        List<Pagamento> pagamentos = pagamentoRepository.findAll();
        model.addAttribute("pagamentos", pagamentos);

        return "pagamento";
    }
}
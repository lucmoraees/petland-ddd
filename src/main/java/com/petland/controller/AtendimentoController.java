package com.petland.controller;

import com.petland.domain.dto.AtendimentoRequest;
import com.petland.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    @Autowired
    private AtendimentoService service;

    @PostMapping()
    public Integer gravar (@RequestBody AtendimentoRequest requisicao){
        return service.gravar(requisicao);
    }
}

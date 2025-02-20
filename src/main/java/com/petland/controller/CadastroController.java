package com.petland.controller;

import com.petland.domain.dto.CadastroRequest;
import com.petland.domain.dto.CadastroResponse;
import com.petland.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {

    @Autowired
    private CadastroService service;


    @GetMapping
    public List<CadastroResponse> get(){
        return service.listar();
    }

    @PostMapping()
    public Integer gravar(@RequestBody CadastroRequest requisicao){
        return service.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id, @RequestBody CadastroRequest requisicao){
        return service.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        service.excluir(id);
    }
}

package com.petland.cadastros.controller;

import com.petland.cadastros.model.dto.AnimalRequest;
import com.petland.cadastros.model.dto.AnimalResponse;
import com.petland.cadastros.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public List<AnimalResponse> findAll() {
        return animalService.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody AnimalRequest requisicao){
        return animalService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id,
                           @RequestBody AnimalRequest requisicao){
        return animalService.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        animalService.excluir(id);
    }
}

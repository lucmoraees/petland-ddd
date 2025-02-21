package com.petland.cadastros.service;

import com.petland.cadastros.model.dto.AnimalRequest;
import com.petland.cadastros.model.dto.AnimalResponse;
import com.petland.cadastros.model.entity.Animal;
import com.petland.cadastros.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<AnimalResponse> findAll() {
        List<Animal> entities = animalRepository.findAll();
        List<AnimalResponse> response = new ArrayList<>();
        for (Animal e: entities){
            AnimalResponse res = new AnimalResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }

    public Integer gravar(AnimalRequest requisicao){
        Animal entidade = new Animal();
        BeanUtils.copyProperties(requisicao, entidade);
        return animalRepository.save(entidade).getId();
    }

    public Integer alterar(Integer id, AnimalRequest requisicao){
        Animal entidade =  animalRepository.findById(id).orElse(null);
        if(entidade != null){
            BeanUtils.copyProperties(requisicao, entidade);
            return animalRepository.save(entidade).getId();
        }
        return null;
    }

    public void excluir(Integer id){
        animalRepository.deleteById(id);
    }
}

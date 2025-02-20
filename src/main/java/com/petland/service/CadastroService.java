package com.petland.service;

import com.petland.domain.dto.CadastroRequest;
import com.petland.domain.dto.CadastroResponse;
import com.petland.domain.entities.Cadastro;
import com.petland.repository.CadastroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository repository;

    public Integer gravar(CadastroRequest requisicao){
        Cadastro entidade = new Cadastro();
        BeanUtils.copyProperties(requisicao, entidade);
        return repository.save(entidade).getId();
    }

    public Integer alterar(Integer id, CadastroRequest requisicao){
        Cadastro entidade =  repository.findById(id).orElse(null);
        if(entidade != null){
            BeanUtils.copyProperties(requisicao, entidade);
            return repository.save(entidade).getId();
        }
        return null;
    }

    public List<CadastroResponse> listar(){
        List<Cadastro> entities = repository.findAll();
        List<CadastroResponse> response = new ArrayList<>();
        for (Cadastro e: entities){
            CadastroResponse res = new CadastroResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }
}

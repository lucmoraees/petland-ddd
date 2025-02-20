package com.petland.service;

import com.petland.domain.dto.AtendimentoRequest;
import com.petland.domain.entities.Atendimento;
import com.petland.repository.AtendimentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository repository;

    public Integer gravar(AtendimentoRequest requisicao){
        Atendimento entidade = new Atendimento();
        BeanUtils.copyProperties(requisicao, entidade);
        return repository.save(entidade).getId();
    }
}

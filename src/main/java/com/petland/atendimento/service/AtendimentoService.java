package com.petland.atendimento.service;

import com.petland.atendimento.model.dto.AtendimentoRequest;
import com.petland.atendimento.model.entity.Atendimento;
import com.petland.atendimento.repository.AtendimentoRepository;
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

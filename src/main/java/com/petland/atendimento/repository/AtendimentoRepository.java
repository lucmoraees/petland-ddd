package com.petland.atendimento.repository;

import com.petland.atendimento.model.entity.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer>{
}

package com.petland.repository;

import com.petland.domain.entities.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
}

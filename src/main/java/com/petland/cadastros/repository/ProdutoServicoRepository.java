package com.petland.cadastros.repository;

import com.petland.cadastros.model.valueObject.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Integer> {

}

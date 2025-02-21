package com.petland.cadastros.model.valueObject;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tab_produto_servico")
@Data
public class ProdutoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 50, nullable = false)
    private String nome;

    private Double valor;

    private boolean servico;
}
package com.petland.cadastros.model.entity;

import com.petland.cadastros.model.valueObject.Endereco;
import com.petland.cadastros.model.valueObject.Perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tab_cadastro")
@Data
public class Cadastro {

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

    @Embedded
    private Perfil perfil;

    @Embedded
    private Endereco endereco;

}
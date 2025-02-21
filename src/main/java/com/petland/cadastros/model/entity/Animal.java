package com.petland.cadastros.model.entity;

import java.time.LocalDate;

import com.petland.cadastros.model.valueObject.AnimalEspecie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "tab_animal")
@Data
public class Animal {
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

    private LocalDate aniversário;

    @Enumerated(EnumType.STRING)
    private AnimalEspecie especie;

}
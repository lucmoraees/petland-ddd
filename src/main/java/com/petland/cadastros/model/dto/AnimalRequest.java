package com.petland.cadastros.model.dto;

import com.petland.cadastros.model.valueObject.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversário;
    private AnimalEspecie especie;
}

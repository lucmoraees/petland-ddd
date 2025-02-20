package com.petland.domain.dto;

import com.petland.domain.valueObjects.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversário;
    private AnimalEspecie especie;
}

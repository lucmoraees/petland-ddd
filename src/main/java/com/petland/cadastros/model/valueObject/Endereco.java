package com.petland.cadastros.model.valueObject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Endereco {
    @Column(length = 50)
    private String logradouro;

    @Column(length = 50)
    private String numero;
}

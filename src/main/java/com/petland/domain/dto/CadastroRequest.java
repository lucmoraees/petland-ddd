package com.petland.domain.dto;

import com.petland.domain.valueObjects.Endereco;
import com.petland.domain.valueObjects.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {
    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}

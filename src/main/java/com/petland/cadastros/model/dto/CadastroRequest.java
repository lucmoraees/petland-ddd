package com.petland.cadastros.model.dto;

import com.petland.cadastros.model.valueObject.Endereco;
import com.petland.cadastros.model.valueObject.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {
    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}

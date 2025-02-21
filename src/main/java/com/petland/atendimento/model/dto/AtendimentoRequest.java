package com.petland.atendimento.model.dto;

import java.time.LocalDate;

import com.petland.atendimento.model.valueObject.AtendimentoStatus;
import com.petland.atendimento.model.valueObject.AtendimentoTipo;
import lombok.Data;

@Data
public class AtendimentoRequest {
    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergencia;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private Integer animal;
    private Integer produtoServico;
    private Integer cadastro;
}

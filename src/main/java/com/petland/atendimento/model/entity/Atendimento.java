package com.petland.atendimento.model.entity;

import java.time.LocalDate;

import com.petland.atendimento.model.valueObject.AtendimentoTipo;
import com.petland.atendimento.model.valueObject.AtendimentoStatus;

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
@Table(name= "tab_atendimento")
@Data
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergencia;

    @Enumerated(EnumType.STRING)
    private AtendimentoTipo tipo;

    @Enumerated(EnumType.STRING)
    private AtendimentoStatus status;

    @Column(name = "pet_id")
    private Integer animal;
    @Column(name = "prod_serv_id")
    private Integer produtoServico;
    @Column(name = "cad_id")
    private Integer cadastro;
}

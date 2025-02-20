package com.petland.domain.entities;

import com.petland.domain.valueObjects.Endereco;
import com.petland.domain.valueObjects.Perfil;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "tab_cadastro")
@Data
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Embedded
    private Perfil perfil;

    @Embedded
    private Endereco endereco;
}

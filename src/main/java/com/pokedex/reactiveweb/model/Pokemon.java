package com.pokedex.reactiveweb.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    @Id
    private String id;

    private String nome;
    private String categoria;
    private String habilidades;
    private Double peso;
}
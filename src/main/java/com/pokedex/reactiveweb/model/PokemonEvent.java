package com.pokedex.reactiveweb.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PokemonEvent {

    private Long eventId;
    private String eventType;

}

package com.jonathan.screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Title") String titulo,
                             @JsonAlias("Season") String temporada,
                             @JsonAlias("Episodes")List<DadosEpisodio> episodiosTemporada) {
}

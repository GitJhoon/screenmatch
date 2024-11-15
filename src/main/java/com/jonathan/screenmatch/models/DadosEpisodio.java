package com.jonathan.screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode")String episodio,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released")String dataLancamento) {
}

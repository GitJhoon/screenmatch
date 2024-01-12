package br.com.jhoonk.screenmatch.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") int Temporada,
                             @JsonAlias("Episode") List<DadosEpisodios> Episodios) {
}

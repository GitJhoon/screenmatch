package br.com.jhoonk.screenmatch.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons")String totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Plot")String sinopse) {

}

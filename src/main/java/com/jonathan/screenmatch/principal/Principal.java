package com.jonathan.screenmatch.principal;

import com.jonathan.screenmatch.models.DadosSerie;
import com.jonathan.screenmatch.models.DadosTemporada;
import com.jonathan.screenmatch.service.consumoApi;
import com.jonathan.screenmatch.service.converteDados;

import java.util.Scanner;


public class Principal {

    final static String ENDERECO = "http://www.omdbapi.com/?t=";
    final static String apiKey = "&apikey=829b2f9b";
    Scanner scanner = new Scanner(System.in);

    public void exibeMenu(){

        String nomeSerie;
        String numeroTemporada;
        String dadosJson;
        var converteDados = new converteDados();
        var consumoApi = new consumoApi();

        System.out.println("Digite o nome da serie que você dejesa buscar: ");
        nomeSerie = scanner.nextLine();
        System.out.println("Digite o numero da temporada: ");
        numeroTemporada = scanner.nextLine();

        dadosJson = consumoApi.obterDados(ENDERECO + nomeSerie
                .replace(" ", "+")+"&season="+numeroTemporada+ apiKey);

        DadosSerie serie = converteDados.conversor(dadosJson, DadosSerie.class);

        System.out.println(serie);

        DadosTemporada temporada = converteDados.conversor(dadosJson, DadosTemporada.class);

        temporada.episodiosTemporada()
                .stream()
                .filter(e -> e.titulo().equalsIgnoreCase("HardHome"))
                .forEach(e -> System.out.println(e.titulo()));
    }
}

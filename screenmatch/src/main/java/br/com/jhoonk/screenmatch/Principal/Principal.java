package br.com.jhoonk.screenmatch.Principal;

import br.com.jhoonk.screenmatch.Models.DadosSerie;
import br.com.jhoonk.screenmatch.Service.ConsumoApi;
import br.com.jhoonk.screenmatch.Service.ConverteDados;

import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);
    String API_KEY = "&apikey=11da4c73";
    String endereco = "http://www.omdbapi.com/?t=";
    ConsumoApi consumoApi = new ConsumoApi();
    ConverteDados conversor = new ConverteDados();
    String json;

    public void exibeMenu(){

        System.out.println("Digite o nome da série: ");
        String nomeSerie = scanner.nextLine();

       json = consumoApi
               .obterDados(endereco+nomeSerie.replace(" ", "+")+API_KEY);

      DadosSerie serie = conversor
              .obterDados(json, DadosSerie.class);

        System.out.println(serie);
    }
}

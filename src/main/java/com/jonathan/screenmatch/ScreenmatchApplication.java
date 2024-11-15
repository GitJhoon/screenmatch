package com.jonathan.screenmatch;

import com.jonathan.screenmatch.models.DadosEpisodio;
import com.jonathan.screenmatch.models.DadosTemporada;
import com.jonathan.screenmatch.principal.Principal;
import com.jonathan.screenmatch.service.consumoApi;
import com.jonathan.screenmatch.service.converteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var principal = new Principal();

		principal.exibeMenu();
	}
}

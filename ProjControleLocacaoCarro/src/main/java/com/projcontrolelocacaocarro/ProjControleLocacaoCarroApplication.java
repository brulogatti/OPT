package com.projcontrolelocacaocarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjControleLocacaoCarroApplication {
	
	//Inicializa a aplicação
		public static void main(String[] args) {
			SpringApplication.run(ProjControleLocacaoCarroApplication.class, args);
		}

}

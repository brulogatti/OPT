package com.projalunos.papelaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class PapelariaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PapelariaApplication.class, args);
	}

}

package com.example.gerenciamentoRestaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestGerenciamentoRestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.from(GerenciamentoRestauranteApplication::main).with(TestGerenciamentoRestauranteApplication.class).run(args);
	}

}

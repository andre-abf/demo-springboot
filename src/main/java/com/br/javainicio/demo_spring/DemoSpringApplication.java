package com.br.javainicio.demo_spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoSpringApplication.class, args);

		System.out.println("Swagger UI disponível em:");
		System.out.println("http://localhost:8080/swagger-ui.html");
	}

}
package com.br.javainicio.demo_spring;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Demo Spring Boot")
                        .version("1.0")
                        .description("Documentação da API de exemplo para testes com Swagger/OpenAPI"));
    }
}

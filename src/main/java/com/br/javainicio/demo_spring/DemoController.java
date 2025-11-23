package com.br.javainicio.demo_spring;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {


    DemoService demoService;


    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @Operation(summary = "Criando registro",
            description = "Cria um novo registro Demo com base no ID e DESCRIPTION informado")
    @PostMapping
    public Demo createDemo(@RequestBody Demo demo){
        return demoService.saveDemo(demo);
    }

    @Operation(summary = "Busca demo por ID", description = "Retorna um registro Demo com base no ID informado")
    @ApiResponse(responseCode = "200", description = "Registro encontrado")
    @ApiResponse(responseCode = "404", description = "Registro não encontrado")
    @GetMapping("/{id}")
    public Demo getDemo(@PathVariable("id") Long id){
        return demoService.getDemo(id).orElse(null);

    }
}

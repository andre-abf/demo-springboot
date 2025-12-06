package com.br.javainicio.demo_spring.controller;

import com.br.javainicio.demo_spring.DemoService;
import com.br.javainicio.demo_spring.DemoServiceImpl;
import com.br.javainicio.demo_spring.entity.DemoEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {


    DemoService demoService;


    public DemoController(DemoServiceImpl demoService) {
        this.demoService = demoService;
    }

    @Operation(summary = "Criando registro",
            description = "Cria um novo registro Demo com base no ID e DESCRIPTION informado")
    @PostMapping
    public DemoEntity createDemo(@RequestBody DemoEntity demo){

        return demoService.saveDemo(demo);
    }

    @Operation(summary = "Busca demo por ID", description = "Retorna um registro Demo com base no ID informado")
    @ApiResponse(responseCode = "200", description = "Registro encontrado")
    @ApiResponse(responseCode = "404", description = "Registro não encontrado")
    @GetMapping("/{id}")
    public DemoEntity getDemo(@PathVariable("id") Long id){
        return demoService.getDemo(id).orElse(null);

    }

    @Operation(summary = "Lista demonstraiva", description = "Retorna uma lista de Id e Nome")
    @GetMapping
    public List<DemoEntity>listDemo(){
        return demoService.listDemo();
    }
}

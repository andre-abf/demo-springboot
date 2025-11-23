package com.br.javainicio.demo_spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {


    DemoService demoService;


    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping
    public Demo createDemo(@RequestBody Demo demo){
        return demoService.saveDemo(demo);
    }

    @GetMapping("/{id}")
    public Demo getDemo(@PathVariable("id") Long id){
        return demoService.getDemo(id).orElse(null);

    }
}

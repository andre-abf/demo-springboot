package com.br.javainicio.demo_spring;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    DemoRepository demoRepository;


    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }


    public Demo saveDemo(Demo demo){

        return demoRepository.save(demo);
    }

    public Optional<Demo> getDemo(Long id){

        return demoRepository.findById(id);

    }
}

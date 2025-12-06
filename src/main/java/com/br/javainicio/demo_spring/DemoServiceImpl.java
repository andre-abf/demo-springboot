package com.br.javainicio.demo_spring;

import com.br.javainicio.demo_spring.entity.DemoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService{

    DemoRepository demoRepository;


    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public DemoEntity saveDemo(DemoEntity demo){

        return demoRepository.save(demo);
    }

    @Override
    public Optional<DemoEntity> getDemo(Long id){

        return demoRepository.findById(id);

    }

    @Override
    public List<DemoEntity>listDemo(){
        return demoRepository.findAll();
    }
}

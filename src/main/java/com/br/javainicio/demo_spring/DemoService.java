package com.br.javainicio.demo_spring;

import com.br.javainicio.demo_spring.entity.DemoEntity;

import java.util.List;
import java.util.Optional;

public interface DemoService {

    DemoEntity saveDemo(DemoEntity demo);

    Optional<DemoEntity>getDemo(Long id);

    List<DemoEntity>listDemo();
}

package com.br.javainicio.demo_spring;

import com.br.javainicio.demo_spring.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {


}

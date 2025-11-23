package com.br.javainicio.demo_spring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {


}

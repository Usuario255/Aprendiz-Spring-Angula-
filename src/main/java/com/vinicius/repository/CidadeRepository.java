package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}

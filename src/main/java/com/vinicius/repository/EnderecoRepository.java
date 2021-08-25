package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}

package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

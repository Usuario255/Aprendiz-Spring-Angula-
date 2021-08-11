package com.vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.dodmain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

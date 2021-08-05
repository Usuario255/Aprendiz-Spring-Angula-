package com.vinicius.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.dodmain.Categoria;
import com.vinicius.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria Buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElse(null); 
		
	}
}

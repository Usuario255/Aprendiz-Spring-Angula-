package com.vinicius.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.domain.Categoria;
import com.vinicius.repository.CategoriaRepository;
import com.vinicius.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria Buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); 
		return  obj.orElseThrow(() -> new ObjectNotFoundException( 
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); 
		
	}
}

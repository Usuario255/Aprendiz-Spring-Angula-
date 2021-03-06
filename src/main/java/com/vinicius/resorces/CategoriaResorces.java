package com.vinicius.resorces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.domain.Categoria;
import com.vinicius.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResorces {
	
	@Autowired
	CategoriaService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.Buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	

}

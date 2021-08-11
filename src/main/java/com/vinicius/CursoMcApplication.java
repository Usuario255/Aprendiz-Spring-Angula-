package com.vinicius;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vinicius.dodmain.Categoria;
import com.vinicius.repository.CategoriaRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Ecritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}

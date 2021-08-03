package com.vinicius.resorces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Categorias")
public class CategoriaResorces {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest Esta funcionando";
	}
	

}

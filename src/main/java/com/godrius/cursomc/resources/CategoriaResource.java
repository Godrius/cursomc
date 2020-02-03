package com.godrius.cursomc.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.godrius.cursomc.domain.Categoria;

/*
 * O package resources é onde comumente se criar os webservices
 * 
 * A anotação @RestController associada a classe será o responsável por criar a API Rest.
 * A anotação @RequestMapping também associada a classe indicará o path do serviço.
 * 
 * Para utilizar o serviço rest associado a essa classe basta acessar o endereço http://localhost:8080/categorias
 * 
 * */

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;
	}

}

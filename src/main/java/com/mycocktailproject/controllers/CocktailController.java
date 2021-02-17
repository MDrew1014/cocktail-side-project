package com.mycocktailproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycocktailproject.dao.CocktailDAO;
import com.mycocktailproject.models.CocktailDBCocktail;
import com.mycocktailproject.services.CocktailDBApiService;


@RequestMapping("/cocktail")
@RestController
public class CocktailController {
private CocktailDAO dao;
private CocktailDBApiService api;
	
	public CocktailController(CocktailDAO dao, CocktailDBApiService api) {
		this.dao = dao;
		this.api = api;
	}
	
	//TODO READ ALL
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public CocktailDBCocktail getById(@PathVariable("id") long idDrink) {
		//return dao.getById(idDrink);
		System.out.println("FUBAR");
		return api.getCocktailById(idDrink);
	}
}

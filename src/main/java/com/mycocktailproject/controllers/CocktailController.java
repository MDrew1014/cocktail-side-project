package com.mycocktailproject.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycocktailproject.dao.CocktailDAO;
import com.mycocktailproject.models.Cocktail;
import com.mycocktailproject.models.CocktailDBCocktail;
import com.mycocktailproject.models.CocktailPreview;
import com.mycocktailproject.services.CocktailDBApiService;

@CrossOrigin()
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
	public Cocktail getById(@PathVariable("id") long idDrink) {
		return api.getCocktailById(idDrink).convertToCocktail();
	}
	//Get by name
	@RequestMapping(path="/byName/{name}", method = RequestMethod.GET)
	public Cocktail[] getByName(@PathVariable("name")String strDrink) {
		CocktailDBCocktail[] apiResult = api.getCocktailByName(strDrink);
		Cocktail[] array = new Cocktail[apiResult.length];
		for(int i =0; i<array.length; i++) {
			array[i] = apiResult[i].convertToCocktail();
		}return array;
	}
	
	
	@RequestMapping(path="/byIngredient/{ingredient}", method = RequestMethod.GET)
	public CocktailPreview[] getByIngredientName(@PathVariable("ingredient")String ingredient) {
		return api.getCocktailPreviewByIngredient(ingredient);
	}
	
	
	//get by ingredient
}

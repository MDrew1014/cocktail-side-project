package com.mycocktailproject.dao;

import java.util.List;

import com.mycocktailproject.models.Cocktail;



public interface CocktailDAO {
	
	List<Cocktail> getAll();
	Cocktail getById(long id);

}

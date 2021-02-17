package com.mycocktailproject.dao;

import java.util.List;

import com.mycocktailproject.models.CocktailDBCocktail;



public interface CocktailDAO {
	
	List<CocktailDBCocktail> getAll();
	CocktailDBCocktail getById(long id);

}

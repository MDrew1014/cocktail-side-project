package com.mycocktailproject.JDBCDao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mycocktailproject.dao.CocktailDAO;
import com.mycocktailproject.models.Cocktail;

@Component
public class JDBCCocktailDAO implements CocktailDAO{

	@Override
	public List<Cocktail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cocktail getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

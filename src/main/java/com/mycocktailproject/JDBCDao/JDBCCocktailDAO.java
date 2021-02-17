package com.mycocktailproject.JDBCDao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mycocktailproject.dao.CocktailDAO;
import com.mycocktailproject.models.CocktailDBCocktail;

@Component
public class JDBCCocktailDAO implements CocktailDAO{

	@Override
	public List<CocktailDBCocktail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CocktailDBCocktail getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

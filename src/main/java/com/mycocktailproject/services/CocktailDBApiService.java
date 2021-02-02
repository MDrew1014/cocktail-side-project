package com.mycocktailproject.services;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.mycocktailproject.models.Cocktail;
import com.mycocktailproject.models.CocktailDBWrapper;
@Component
public class CocktailDBApiService {
	
	private final RestTemplate restTemplate = new RestTemplate();
	private final String BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1";
	

	
	public Cocktail getCocktailById(long id) {
		String queryUrl = BASE_URL + "/lookup.php";
		Map<String, String> params = new HashMap<>();
		params.put("i", ""+ id);
		 HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.getForEntity(queryUrl, CocktailDBWrapper.class, params);
		CocktailDBWrapper result = restTemplate.getForObject(queryUrl, CocktailDBWrapper.class, params);
		if(result != null && result.getDrinks() != null && result.getDrinks().length ==1) {
			return result.getDrinks()[0];
		} else {
			//this is where you would throw an exception 404
			return null;
		}
		
		
	}
}

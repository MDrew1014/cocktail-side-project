package com.mycocktailproject.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.mycocktailproject.models.CocktailDBCocktail;
import com.mycocktailproject.models.CocktailDBWrapper;
@Component
public class CocktailDBApiService {
	
	private final RestTemplate restTemplate = new RestTemplate();
	private final String BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1";
	

	
	public CocktailDBCocktail getCocktailById(long id) {
		String queryUrl = BASE_URL + "/lookup.php?i={i}";
		Map<String, String> params = new HashMap<>();
		params.put("i", ""+ id); 
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity input = new HttpEntity<>(headers);
		HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.exchange(queryUrl, HttpMethod.GET, input, CocktailDBWrapper.class, params);
		CocktailDBWrapper result = resultEntity.getBody();
		if(result != null && result.getDrinks() != null && result.getDrinks().length ==1) {
			return result.getDrinks()[0];
		} else {
			//this is where you would throw an exception 404
			return null;
		}
		
		
	}
}

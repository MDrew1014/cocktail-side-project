package com.mycocktailproject.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.mycocktailproject.models.CocktailDBCocktail;
import com.mycocktailproject.models.CocktailDBWrapper;
import com.mycocktailproject.models.CocktailIngredient;
import com.mycocktailproject.models.CocktailIngredientWrapper;
import com.mycocktailproject.models.CocktailPreview;
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
	public CocktailDBCocktail[] getCocktailByName(String name) {
		String queryUrl = BASE_URL + "/search.php?s={name}";
		Map<String, String> params = new HashMap<>();
		params.put("name", ""+ name); 
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity input = new HttpEntity<>(headers);
		HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.exchange(queryUrl, HttpMethod.GET, input, CocktailDBWrapper.class, params);
		CocktailDBWrapper result = resultEntity.getBody();
		if(result != null && result.getDrinks() != null) {
			return result.getDrinks();
		} else {
			//this is where you would throw an exception 404
			return null;
		}
		
		
	}
	public CocktailPreview[] getCocktailPreviewByIngredient(String ingredient) {
		String queryUrl = BASE_URL + "/filter.php?i={ingredient}";
		Map<String, String> params = new HashMap<>();
		params.put("ingredient", ""+ ingredient); 
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity input = new HttpEntity<>(headers);
		HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.exchange(queryUrl, HttpMethod.GET, input, CocktailDBWrapper.class, params);
		CocktailDBWrapper result = resultEntity.getBody();
		if(result != null && result.getDrinks() != null) {
			CocktailPreview[] previews = new CocktailPreview[result.getDrinks().length];
			for(int i = 0; i< previews.length; i++) {
				CocktailPreview cocktailPreview = new CocktailPreview();
				CocktailDBCocktail db = result.getDrinks()[i];
				cocktailPreview.setName(db.getStrDrink());
				cocktailPreview.setId(db.getIdDrink());
				cocktailPreview.setPhotoUrl(db.getStrDrinkThumb());
				previews[i] = cocktailPreview;
			}
			return previews;
		} else {
			//this is where you would throw an exception 404
			return null;
		}
		
		
	}
}

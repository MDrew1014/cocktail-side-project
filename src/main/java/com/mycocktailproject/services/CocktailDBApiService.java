package com.mycocktailproject.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.mycocktailproject.models.CocktailDBCocktail;
import com.mycocktailproject.models.CocktailDBWrapper;
import com.mycocktailproject.models.CocktailPreview;
import org.slf4j.LoggerFactory;

@Component
public class CocktailDBApiService {

	private final RestTemplate restTemplate = new RestTemplate();
	private final String BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1";
	private final Logger log = org.slf4j.LoggerFactory.getLogger(CocktailDBApiService.class);
	
	
	public CocktailDBCocktail getCocktailById(long id) {
		String queryUrl = BASE_URL + "/lookup.php?i={i}";
		Map<String, String> params = new HashMap<>();
		params.put("i", "" + id);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity input = new HttpEntity<>(headers);
		try {
			HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.exchange(queryUrl, HttpMethod.GET, input,
					CocktailDBWrapper.class, params);
			CocktailDBWrapper result = resultEntity.getBody();
			if (result != null && result.getDrinks() != null && result.getDrinks().length == 1) {
				return result.getDrinks()[0];
			}
		} catch (RestClientResponseException ex) {
			log.error("Rest client fetching client by id", ex);
		} catch (ResourceAccessException ex) {
			System.out.println(ex.getMessage()); //logger 
		}
		return null;
	}

	public CocktailDBCocktail[] getCocktailByName(String name) {
		String queryUrl = BASE_URL + "/search.php?s={name}";
		Map<String, String> params = new HashMap<>();
		params.put("name", "" + name);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity input = new HttpEntity<>(headers);
		try {
			HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.exchange(queryUrl, HttpMethod.GET, input,
					CocktailDBWrapper.class, params);
			CocktailDBWrapper result = resultEntity.getBody();
			if (result != null && result.getDrinks() != null) {
				return result.getDrinks();
			}
		} catch (RestClientResponseException ex) {
			System.out.println(ex.getRawStatusCode() + " : " + ex.getStatusText());
		} catch (ResourceAccessException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public CocktailPreview[] getCocktailPreviewByIngredient(String ingredient) {
		String queryUrl = BASE_URL + "/filter.php?i={ingredient}";
		Map<String, String> params = new HashMap<>();
		params.put("ingredient", "" + ingredient);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity input = new HttpEntity<>(headers);
		try {
			HttpEntity<CocktailDBWrapper> resultEntity = restTemplate.exchange(queryUrl, HttpMethod.GET, input,
					CocktailDBWrapper.class, params);
			CocktailDBWrapper result = resultEntity.getBody();
			if (result != null && result.getDrinks() != null) {
				CocktailPreview[] previews = new CocktailPreview[result.getDrinks().length];
				for (int i = 0; i < previews.length; i++) {
					CocktailPreview cocktailPreview = new CocktailPreview();
					CocktailDBCocktail db = result.getDrinks()[i];
					cocktailPreview.setName(db.getStrDrink());
					cocktailPreview.setId(db.getIdDrink());
					cocktailPreview.setPhotoUrl(db.getStrDrinkThumb());
					previews[i] = cocktailPreview;
				}
				return previews;

			}
		} catch (RestClientResponseException ex) {
			System.out.println(ex.getRawStatusCode() + " : " + ex.getStatusText());
		} catch (ResourceAccessException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
}

package com.mycocktailsideproject.services;

import org.springframework.web.client.RestTemplate;

public class CocktailDBApiService {
	
	private final RestTemplate restTemplate = new RestTemplate();
	private final String BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1";
	

}

package com.mycocktailproject.models;

import java.util.List;

public class Cocktail {
	
	private long id;
	private String name;
	private boolean isAlcoholic;
	private String instructions;
	private String glass;
	private List<String> ingredients;
	
	public Cocktail() {}
	
	
	public Cocktail(long id, String name, boolean isAlcoholic, String instructions, String glass,
			List<String> ingredients) {
		this.id = id;
		this.name = name;
		this.isAlcoholic = isAlcoholic;
		this.instructions = instructions;
		this.glass = glass;
		this.ingredients = ingredients;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlcoholic() {
		return isAlcoholic;
	}
	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getGlass() {
		return glass;
	}
	public void setGlass(String glass) {
		this.glass = glass;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	

}

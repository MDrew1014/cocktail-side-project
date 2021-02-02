package com.mycocktailproject.models;

public class Cocktail {
	
	private long idDrink;
	private String strDrink;
	private String strAlcoholic;
	private String strGlass;
	private String strInstructions;
	private String strCategory;
	
	
	public Cocktail(long idDrink, String strDrink, String strAlcoholic, String strGlass, String strInstructions,
			String strCategory) {
		this.idDrink = idDrink;
		this.strDrink = strDrink;
		this.strAlcoholic = strAlcoholic;
		this.strGlass = strGlass;
		this.strInstructions = strInstructions;
		this.strCategory = strCategory;
	}


	public long getIdDrink() {
		return idDrink;
	}


	public String getStrDrink() {
		return strDrink;
	}


	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}


	public String getStrAlcoholic() {
		return strAlcoholic;
	}


	public void setStrAlcoholic(String strAlcoholic) {
		this.strAlcoholic = strAlcoholic;
	}


	public String getStrGlass() {
		return strGlass;
	}


	public void setStrGlass(String strGlass) {
		this.strGlass = strGlass;
	}


	public String getStrInstructions() {
		return strInstructions;
	}


	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}


	public String getStrCategory() {
		return strCategory;
	}


	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}
	
	
	

}

package com.mycocktailproject.models;

import java.util.ArrayList;
import java.util.List;

public class CocktailDBCocktail {

	private long idDrink;
	private String strDrink;
	private String strAlcoholic;
	private String strGlass;
	private String strInstructions;
	private String strDrinkThumb;
	private String strCategory;
	private String strIngredient1;
	private String strIngredient2;
	private String strIngredient3;
	private String strIngredient4;
	private String strIngredient5;
	private String strIngredient6;
	private String strIngredient7;
	private String strIngredient8;
	private String strIngredient9;
	private String strIngredient10;
	private String strIngredient11;
	private String strIngredient12;
	private String strIngredient13;
	private String strIngredient14;
	private String strIngredient15;

	public CocktailDBCocktail() {

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

	public String getStrIngredient1() {
		return strIngredient1;
	}

	public void setStrIngredient1(String strIngredient1) {
		this.strIngredient1 = strIngredient1;
	}

	public String getStrIngredient2() {
		return strIngredient2;
	}

	public void setStrIngredient2(String strIngredient2) {
		this.strIngredient2 = strIngredient2;
	}

	public String getStrIngredient3() {
		return strIngredient3;
	}

	public void setStrIngredient3(String strIngredient3) {
		this.strIngredient3 = strIngredient3;
	}

	public String getStrIngredient4() {
		return strIngredient4;
	}

	public void setStrIngredient4(String strIngredient4) {
		this.strIngredient4 = strIngredient4;
	}

	public String getStrIngredient5() {
		return strIngredient5;
	}

	public void setStrIngredient5(String strIngredient5) {
		this.strIngredient5 = strIngredient5;
	}

	public String getStrIngredient6() {
		return strIngredient6;
	}

	public void setStrIngredient6(String strIngredient6) {
		this.strIngredient6 = strIngredient6;
	}

	public String getStrIngredient7() {
		return strIngredient7;
	}

	public void setStrIngredient7(String strIngredient7) {
		this.strIngredient7 = strIngredient7;
	}

	public String getStrIngredient8() {
		return strIngredient8;
	}

	public void setStrIngredient8(String strIngredient8) {
		this.strIngredient8 = strIngredient8;
	}

	public String getStrIngredient9() {
		return strIngredient9;
	}

	public void setStrIngredient9(String strIngredient9) {
		this.strIngredient9 = strIngredient9;
	}

	public String getStrIngredient10() {
		return strIngredient10;
	}

	public void setStrIngredient10(String strIngredient10) {
		this.strIngredient10 = strIngredient10;
	}

	public String getStrIngredient11() {
		return strIngredient11;
	}

	public void setStrIngredient11(String strIngredient11) {
		this.strIngredient11 = strIngredient11;
	}

	public String getStrIngredient12() {
		return strIngredient12;
	}

	public void setStrIngredient12(String strIngredient12) {
		this.strIngredient12 = strIngredient12;
	}

	public String getStrIngredient13() {
		return strIngredient13;
	}

	public void setStrIngredient13(String strIngredient13) {
		this.strIngredient13 = strIngredient13;
	}

	public String getStrIngredient14() {
		return strIngredient14;
	}

	public void setStrIngredient14(String strIngredient14) {
		this.strIngredient14 = strIngredient14;
	}

	public String getStrIngredient15() {
		return strIngredient15;
	}

	public void setStrIngredient15(String strIngredient15) {
		this.strIngredient15 = strIngredient15;
	}

	public String getStrDrinkThumb() {
		return strDrinkThumb;
	}

	public void setStrDrinkThumb(String strDrinkThumb) {
		this.strDrinkThumb = strDrinkThumb;
	}

	public Cocktail convertToCocktail() {
		Cocktail cocktail = new Cocktail();
		cocktail.setId(this.idDrink);
		cocktail.setName(this.strDrink);
		cocktail.setAlcoholic(this.strAlcoholic.toLowerCase().contains("alcoholic"));
		cocktail.setInstructions(this.strInstructions);
		cocktail.setGlass(this.strGlass);
		List<String> list = new ArrayList<>();
		if (this.strIngredient1 != null && !this.strIngredient1.trim().equals("")) {
			list.add(this.strIngredient1);
		}
		if (this.strIngredient2 != null && !this.strIngredient2.trim().equals("")) {
			list.add(this.strIngredient2);

		}
		if (this.strIngredient3 != null && !this.strIngredient3.trim().equals("")) {
			list.add(this.strIngredient3);

		}
		if (this.strIngredient4 != null && !this.strIngredient4.trim().equals("")) {
			list.add(this.strIngredient4);

		}
		if (this.strIngredient5 != null && !this.strIngredient5.trim().equals("")) {
			list.add(this.strIngredient5);

		}
		if (this.strIngredient6 != null && !this.strIngredient6.trim().equals("")) {
			list.add(this.strIngredient6);

		}
		if (this.strIngredient7 != null && !this.strIngredient7.trim().equals("")) {
			list.add(this.strIngredient7);

		}
		if (this.strIngredient8 != null && !this.strIngredient8.trim().equals("")) {
			list.add(this.strIngredient8);

		}
		if (this.strIngredient9 != null && !this.strIngredient9.trim().equals("")) {
			list.add(this.strIngredient9);

		}
		if (this.strIngredient10 != null && !this.strIngredient10.trim().equals("")) {
			list.add(this.strIngredient10);

		}
		if (this.strIngredient11 != null && !this.strIngredient11.trim().equals("")) {
			list.add(this.strIngredient11);

		}
		if (this.strIngredient12 != null && !this.strIngredient12.trim().equals("")) {
			list.add(this.strIngredient12);

		}
		if (this.strIngredient13 != null && !this.strIngredient13.trim().equals("")) {
			list.add(this.strIngredient13);

		}
		if (this.strIngredient14 != null && !this.strIngredient14.trim().equals("")) {
			list.add(this.strIngredient14);

		}
		if (this.strIngredient15 != null && !this.strIngredient15.trim().equals("")) {
			list.add(this.strIngredient15);

		}
		cocktail.setIngredients(list);

		return cocktail;
	}

}

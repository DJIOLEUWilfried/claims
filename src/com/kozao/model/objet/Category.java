package com.kozao.model.objet;

public class Category {
	
	private int idCategory ;
	private String nameCategory ;
	private String descriptionCategory ;
	
	
	public Category() {
		super();
	}

	public Category(String nameCategory, String descriptionCategory) {
		super();
		this.nameCategory = nameCategory;
		this.descriptionCategory = descriptionCategory;
	}
	
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	public String getDescriptionCategory() {
		return descriptionCategory;
	}
	public void setDescriptionCategory(String descriptionCategory) {
		this.descriptionCategory = descriptionCategory;
	}
	
	
	

}

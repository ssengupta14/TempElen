package com.elenverve.dao.product;

import java.util.List;

public class Category {
	private String categoryId;
	private String categoryName;
	// Category can have products or subcategories which contain products. 
	// This way we can achieve any level of categories
	private List<Category> subcategories;
	private List<Product> products;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Category> getSubcategories() {
		return subcategories;
	}
	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}

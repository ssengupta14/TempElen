package com.elenverve.dao.product;

import java.util.List;

public class Collection {
	private String collectionId;
	private String collectionName;
	private String description;
	// collections can have products or categories or designers
	private List<Product> products;
	private List<Category> categories;
	private List<Designer> designers;
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<Designer> getDesigners() {
		return designers;
	}
	public void setDesigners(List<Designer> designers) {
		this.designers = designers;
	}
	

}

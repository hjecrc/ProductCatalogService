package com.productcatalogservice.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String alias;
	private ProductCategoryResponse productCategory;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	@JsonProperty("productCategories")
	public ProductCategoryResponse getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategoryResponse productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "BrandResponse [name=" + name + ", alias=" + alias + ", productCategory=" + productCategory + "]";
	}
	public BrandResponse(String name, String alias, ProductCategoryResponse productCategory) {
		super();
		this.name = name;
		this.alias = alias;
		this.productCategory = productCategory;
	}
	public BrandResponse() {
		super();
	}
	
}

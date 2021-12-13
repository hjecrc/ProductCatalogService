package com.productcatalogservice.vo;

import org.springframework.stereotype.Component;

@Component
public class BrandRequest {


	private String name;
	private String alias;
	private ProductCategoryRequest productCategory;
	
	boolean isActive;

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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public ProductCategoryRequest getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategoryRequest productCategory) {
		this.productCategory = productCategory;
	}
	public BrandRequest(String name, String alias, ProductCategoryRequest productCategory, boolean isActive) {
		super();
		this.name = name;
		this.alias = alias;
		this.productCategory = productCategory;
		this.isActive = isActive;
	}
	public BrandRequest() {
		super();
	}
	@Override
	public String toString() {
		return "BrandRequest [name=" + name + ", alias=" + alias + ", productCategory=" + productCategory
				+ ", isActive=" + isActive + "]";
	}
}

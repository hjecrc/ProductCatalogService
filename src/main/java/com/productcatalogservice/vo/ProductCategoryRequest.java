package com.productcatalogservice.vo;

import org.springframework.stereotype.Component;

@Component
public class ProductCategoryRequest {

	String name;
	String alias;
	boolean isActive;
	public ProductCategoryRequest(String name, String alias, boolean isActive) {
		super();
		this.name = name;
		this.alias = alias;
		this.isActive = isActive;
	}
	public ProductCategoryRequest() {
		super();
	}
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
	@Override
	public String toString() {
		return "ProductCategoryRequest [name=" + name + ", alias=" + alias + ", isActive=" + isActive + "]";
	}
}

package com.productcatalogservice.vo;

import org.springframework.stereotype.Component;

@Component
public class ProductRequest {

	private String name;
	private String alias;
	private boolean isActive;
	private BrandRequest brandRequest;
	private ResellerRequest resellerRequest;
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
	public BrandRequest getBrandRequest() {
		return brandRequest;
	}
	public void setBrandRequest(BrandRequest brandRequest) {
		this.brandRequest = brandRequest;
	}
	public ResellerRequest getResellerRequest() {
		return resellerRequest;
	}
	public void setResellerRequest(ResellerRequest resellerRequest) {
		this.resellerRequest = resellerRequest;
	}
	public ProductRequest(String name, String alias, boolean isActive, 
			BrandRequest brandRequest, ResellerRequest resellerRequest) {
		super();
		this.name = name;
		this.alias = alias;
		this.isActive = isActive;
		this.brandRequest = brandRequest;
		this.resellerRequest = resellerRequest;
	}
	public ProductRequest() {
		super();
	}
	@Override
	public String toString() {
		return "ProductRequest [name=" + name + ", alias=" + alias + ", isActive=" + isActive
				 + ", brandRequest=" + brandRequest + ", resellerRequest=" + resellerRequest + "]";
	}
}

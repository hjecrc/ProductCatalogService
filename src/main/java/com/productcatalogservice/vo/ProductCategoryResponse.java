package com.productcatalogservice.vo;

import java.io.Serializable;
import java.util.List;

public class ProductCategoryResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String alias;
	private List<BrandResponse> lstBrands;
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
	public List<BrandResponse> getLstBrands() {
		return lstBrands;
	}
	public void setLstBrands(List<BrandResponse> lstBrands) {
		this.lstBrands = lstBrands;
	}
	@Override
	public String toString() {
		return "ProductCategoryResponse [name=" + name + ", alias=" + alias + ", lstBrands=" + lstBrands + "]";
	}
	public ProductCategoryResponse(String name, String alias, List<BrandResponse> lstBrands) {
		super();
		this.name = name;
		this.alias = alias;
		this.lstBrands = lstBrands;
	}
	public ProductCategoryResponse() {
		super();
	}
}

package com.productcatalogservice.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String alias;
	private BrandResponse lstBrands;
	private ResellerResponse lstReseller;
	
	
	public ProductResponse() {
		super();
	}
	public ProductResponse(String name, String alias, BrandResponse lstBrands, ResellerResponse lstReseller) {
		super();
		this.name = name;
		this.alias = alias;
		this.lstBrands = lstBrands;
		this.lstReseller = lstReseller;
	}

	@JsonProperty("brands")
	public BrandResponse getLstBrands() {
		return lstBrands;
	}
	public void setLstBrands(BrandResponse lstBrands) {
		this.lstBrands = lstBrands;
	}
	
	@JsonProperty("resellers")
	public ResellerResponse getLstReseller() {
		return lstReseller;
	}
	public void setLstReseller(ResellerResponse lstReseller) {
		this.lstReseller = lstReseller;
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
	@Override
	public String toString() {
		return "ProductResponse [name=" + name + ", alias=" + alias + ", lstBrands=" + lstBrands + ", lstReseller="
				+ lstReseller + "]";
	}
	
}

package com.productcatalogservice.vo;

import java.io.Serializable;

public class ResellerResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String alias;
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
	public ResellerResponse(String name, String alias) {
		super();
		this.name = name;
		this.alias = alias;
	}
	public ResellerResponse() {
		super();
	}
	@Override
	public String toString() {
		return "ResellerResponse [name=" + name + ", alias=" + alias + "]";
	}
	
	
}

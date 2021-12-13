package com.productcatalogservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBLMBRAND")
public class Brand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50)	
	private String name;

	@Column(length = 50,unique = true,updatable = false,insertable = true)	
	private String alias;
	
	@Column(length = 50)	
	private boolean isActive;


	@ManyToOne
	@JoinColumn(name = "productcategory_id", nullable = false)
	private ProductCategory productCategory;
	
	public Brand(String name, String alias, boolean isActive, ProductCategory productCategory) {
		super();
		this.name = name;
		this.alias = alias;
		this.isActive = isActive;
		this.productCategory = productCategory;
	}

	public Brand() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", alias=" + alias + ", isActive=" + isActive + "]";
	}
}

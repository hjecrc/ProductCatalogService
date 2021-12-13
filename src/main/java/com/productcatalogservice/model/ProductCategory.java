package com.productcatalogservice.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBLMPRODUCTCATEGORY")
public class ProductCategory implements Serializable{

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
	
	@Column	
	private boolean isActive;


	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "productCategory")
	private List<Brand> brands;
	
	public ProductCategory(String name, String alias, boolean isActive) {
		super();
		this.name = name;
		this.alias = alias;
		this.isActive = isActive;
	}

	public ProductCategory() {
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

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", name=" + name + ", alias=" + alias + ", isActive=" + isActive + "]";
	}
}

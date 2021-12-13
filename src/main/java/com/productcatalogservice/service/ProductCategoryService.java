package com.productcatalogservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogservice.model.ProductCategory;
import com.productcatalogservice.repository.ProductCategoryRepository;
import com.productcatalogservice.vo.ProductCategoryRequest;

@Service
public class ProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	public List<ProductCategory> getAllProductCategories(){
		return productCategoryRepository.findAll();
	}

	public ProductCategory saveProductCategory(ProductCategoryRequest request) {
		return productCategoryRepository.save(new ProductCategory(request.getName(), request.getAlias(), request.isActive()));
	}

}

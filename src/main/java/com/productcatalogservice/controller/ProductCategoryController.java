package com.productcatalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogservice.model.ProductCategory;
import com.productcatalogservice.service.ProductCategoryService;
import com.productcatalogservice.vo.ProductCategoryRequest;

@RestController
@RequestMapping("/productcatalog")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	@GetMapping("/productcategories")
	public List<ProductCategory> getAllProductCategories(){
		return productCategoryService.getAllProductCategories();
	}
	
	@PostMapping("/productcategories/productcategory")
	public ProductCategory createProductCategory(@RequestBody ProductCategoryRequest request) {
		return productCategoryService.saveProductCategory(request);
	}
}

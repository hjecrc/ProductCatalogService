package com.productcatalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogservice.model.Product;
import com.productcatalogservice.service.ProductService;
import com.productcatalogservice.vo.ProductRequest;
import com.productcatalogservice.vo.ProductResponse;

@RestController
@RequestMapping("/productcatalog")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<ProductResponse> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping("/products/product")
	public Product createReseller(@RequestBody ProductRequest request) {
		return productService.createProduct(request);
	}
}

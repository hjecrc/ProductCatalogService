package com.productcatalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogservice.model.Brand;
import com.productcatalogservice.service.BrandService;
import com.productcatalogservice.vo.BrandRequest;

@RestController
@RequestMapping("productcatalog")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@GetMapping("/brands")
	public List<Brand> getAllBrands(){
		return brandService.getAllBrands();
	}
	
	@PostMapping("/brands/brand")
	public Brand createBrand(@RequestBody BrandRequest request) {
		return brandService.createBrand(request);
	}
}

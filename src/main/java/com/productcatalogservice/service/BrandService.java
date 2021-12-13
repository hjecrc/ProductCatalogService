package com.productcatalogservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogservice.model.Brand;
import com.productcatalogservice.model.ProductCategory;
import com.productcatalogservice.repository.BrandRepository;
import com.productcatalogservice.repository.ProductCategoryRepository;
import com.productcatalogservice.vo.BrandRequest;
import com.productcatalogservice.vo.ProductCategoryRequest;

@Service
public class BrandService {

	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	

	public List<Brand> getAllBrands() {
		return brandRepository.findAll();
	}

	public Brand createBrand(BrandRequest request) {
		Brand newbrand = null;
		ProductCategoryRequest productCategoryReq = request.getProductCategory();
		Optional<ProductCategory> productCategory = Optional.empty();
		if(productCategoryReq != null) {
			productCategory = productCategoryRepository.findByAlias(productCategoryReq.getAlias());
		}else {
			productCategory = productCategoryRepository.findByAlias("OTHER");
		}
		if(productCategory.isPresent()) {
			newbrand = brandRepository.save(new Brand(request.getName(), request.getAlias(), request.isActive(), productCategory.get()));	
		}else {
			ProductCategory newProductCategory = productCategoryRepository.save(new ProductCategory(productCategoryReq.getName(), productCategoryReq.getAlias(), productCategoryReq.isActive()));
			newbrand = brandRepository.save(new Brand(request.getName(), request.getAlias(), request.isActive(), newProductCategory));	
		}
		return newbrand;
	}
}

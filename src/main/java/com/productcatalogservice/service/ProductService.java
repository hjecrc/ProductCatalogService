package com.productcatalogservice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogservice.model.Brand;
import com.productcatalogservice.model.Product;
import com.productcatalogservice.model.ProductCategory;
import com.productcatalogservice.model.Reseller;
import com.productcatalogservice.repository.BrandRepository;
import com.productcatalogservice.repository.ProductRepository;
import com.productcatalogservice.repository.ResellerRepository;
import com.productcatalogservice.vo.BrandRequest;
import com.productcatalogservice.vo.BrandResponse;
import com.productcatalogservice.vo.ProductCategoryResponse;
import com.productcatalogservice.vo.ProductRequest;
import com.productcatalogservice.vo.ProductResponse;
import com.productcatalogservice.vo.ResellerRequest;
import com.productcatalogservice.vo.ResellerResponse;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ResellerRepository resellerRepository;
	
	@Autowired
	private ResellerService resellerService;
	
	@Autowired
	private BrandRepository brandRepository;

	@Autowired
	private BrandService brandService;

	public List<ProductResponse> getAllProducts() {
		List<Product> lstProducts = productRepository.findAll();
		List<ProductResponse> lstProductResponse = new ArrayList<>();
		lstProducts.stream().filter(product -> product.isActive()).collect(Collectors.toList()).forEach(product -> {
			Brand productBrand = product.getBrand();
			ProductCategory productCategory = productBrand.getProductCategory();
			BrandResponse brandResponse = new BrandResponse(productBrand.getName(), productBrand.getAlias(), new ProductCategoryResponse(productCategory.getName(), productCategory.getAlias(), null));
			ResellerResponse productReseller = new ResellerResponse(product.getReseller().getName(), product.getReseller().getAlias());
			lstProductResponse.add(new ProductResponse(product.getName(), product.getAlias(), brandResponse, productReseller));
		});
		return lstProductResponse;
	}

	public Product createProduct(ProductRequest request) {
		ResellerRequest resellerReq = request.getResellerRequest();
		Optional<Reseller> reseller = Optional.empty();
		if(resellerReq != null) {
			reseller = resellerRepository.findByAlias(resellerReq.getAlias());
			if(!reseller.isPresent()) {
				reseller = Optional.of(resellerService.createReseller(resellerReq));
			}
		}else {
			reseller = resellerRepository.findByAlias("OTHER");
		}

		BrandRequest brandReq = request.getBrandRequest();
		Optional<Brand> brand = Optional.empty();
		if(brandReq != null) {
			brand = brandRepository.findByAlias(brandReq.getAlias());
			if(!brand.isPresent()) {
				brand = Optional.of(brandService.createBrand(brandReq));
			}
		}else {
			brand = brandRepository.findByAlias("OTHER");
		}

		Product newProduct = productRepository.save(new Product(request.getName(), request.getAlias(), request.isActive(), brand.get(), reseller.get()));
		return newProduct;
	}

}

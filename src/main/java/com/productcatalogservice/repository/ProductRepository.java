package com.productcatalogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}

package com.productcatalogservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalogservice.model.Reseller;

@Repository
public interface ResellerRepository extends JpaRepository<Reseller, Integer>{

	Optional<Reseller> findByAlias(String alias);

}

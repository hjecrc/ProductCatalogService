package com.productcatalogservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogservice.model.Reseller;
import com.productcatalogservice.repository.ResellerRepository;
import com.productcatalogservice.vo.ResellerRequest;

@Service
public class ResellerService {

	@Autowired
	private ResellerRepository resellerRepository;
	
	public List<Reseller> getAllResellers() {
		return resellerRepository.findAll();
	}

	public Reseller createReseller(ResellerRequest request) {
		return resellerRepository.save(new Reseller(request.getName(), request.getAlias(), request.isActive()));
	}

}

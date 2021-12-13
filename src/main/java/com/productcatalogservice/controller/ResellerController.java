package com.productcatalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogservice.model.Reseller;
import com.productcatalogservice.service.ResellerService;
import com.productcatalogservice.vo.ResellerRequest;

@RestController
@RequestMapping("productcatalog")
public class ResellerController {

	@Autowired
	private ResellerService resellerService;
	
	@GetMapping("/resellers")
	public List<Reseller> getAllResellers(){
		return resellerService.getAllResellers();
	}
	
	@PostMapping("/resellers/reseller")
	public Reseller createReseller(@RequestBody ResellerRequest request) {
		return resellerService.createReseller(request);
	}
}

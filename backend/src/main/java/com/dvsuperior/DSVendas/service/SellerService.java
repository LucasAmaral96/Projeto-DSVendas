package com.dvsuperior.DSVendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvsuperior.DSVendas.dto.SellerDTO;
import com.dvsuperior.DSVendas.entities.Seller;
import com.dvsuperior.DSVendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findA11() {
	    List<Seller> result = repository.findAll();
	    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}

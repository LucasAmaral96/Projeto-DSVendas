package com.dvsuperior.DSVendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dvsuperior.DSVendas.dto.SaleDTO;
import com.dvsuperior.DSVendas.dto.SaleSuccessDTO;
import com.dvsuperior.DSVendas.dto.SaleSumDTO;
import com.dvsuperior.DSVendas.entities.Sale;
import com.dvsuperior.DSVendas.repositories.SaleRepository;
import com.dvsuperior.DSVendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findA11(Pageable pageable) {
		sellerRepository.findAll();
	    Page<Sale> result = repository.findAll(pageable);
	    return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}

package com.dvsuperior.DSVendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvsuperior.DSVendas.dto.SaleDTO;
import com.dvsuperior.DSVendas.service.SaleService;

@RestController
@RequestMapping(value ="/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findA11(Pageable pageable) {
		Page<SaleDTO> list = service.findA11(pageable);
		return ResponseEntity.ok(list); 
	}
}

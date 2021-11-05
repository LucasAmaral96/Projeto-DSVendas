package com.dvsuperior.DSVendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvsuperior.DSVendas.dto.SellerDTO;
import com.dvsuperior.DSVendas.service.SellerService;

@RestController
@RequestMapping(value ="/sellers")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findA11() {
		List<SellerDTO> list = service.findA11();
		return ResponseEntity.ok(list); 
	}
}

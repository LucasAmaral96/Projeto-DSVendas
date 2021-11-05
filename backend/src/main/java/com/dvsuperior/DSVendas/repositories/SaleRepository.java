package com.dvsuperior.DSVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.DSVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	
}

package com.dvsuperior.DSVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.DSVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}

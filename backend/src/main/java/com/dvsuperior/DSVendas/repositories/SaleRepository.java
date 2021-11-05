package com.dvsuperior.DSVendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dvsuperior.DSVendas.dto.SaleSuccessDTO;
import com.dvsuperior.DSVendas.dto.SaleSumDTO;
import com.dvsuperior.DSVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	 
    @Query("SELECT new com.dvsuperior.DSVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
    
    @Query("SELECT new com.dvsuperior.DSVendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}

package com.felipebreve.fsbvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.felipebreve.fsbvendas.dto.SaleSuccessDTO;
import com.felipebreve.fsbvendas.dto.SaleSumDTO;
import com.felipebreve.fsbvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.felipebreve.fsbvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP By obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.felipebreve.fsbvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP By obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}

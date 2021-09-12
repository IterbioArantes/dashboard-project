package com.salesdashborad.salesds.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesdashborad.salesds.dto.SaleSuccessDTO;
import com.salesdashborad.salesds.dto.SaleSumDTO;
import com.salesdashborad.salesds.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{
	
	@Query("SELECT new com.salesdashborad.salesds.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.salesdashborad.salesds.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();
}

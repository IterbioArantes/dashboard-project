package com.salesdashborad.salesds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesdashborad.salesds.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{

}

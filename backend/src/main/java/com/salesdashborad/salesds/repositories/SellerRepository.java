package com.salesdashborad.salesds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesdashborad.salesds.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long>{

}

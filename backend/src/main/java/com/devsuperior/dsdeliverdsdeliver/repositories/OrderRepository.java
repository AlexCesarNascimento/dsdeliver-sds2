package com.devsuperior.dsdeliverdsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliverdsdeliver.entities.Product;

public interface OrderRepository extends JpaRepository<Product, Long>{
	
}

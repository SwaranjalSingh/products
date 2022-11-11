package com.product.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.product.entities.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

	
}

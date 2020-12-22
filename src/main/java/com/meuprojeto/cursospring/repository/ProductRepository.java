package com.meuprojeto.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.cursospring.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}

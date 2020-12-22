package com.meuprojeto.cursospring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.cursospring.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}

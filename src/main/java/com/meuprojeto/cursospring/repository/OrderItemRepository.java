package com.meuprojeto.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.cursospring.entity.OrderItem;
import com.meuprojeto.cursospring.entity.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}

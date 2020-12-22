package com.meuprojeto.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.cursospring.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}

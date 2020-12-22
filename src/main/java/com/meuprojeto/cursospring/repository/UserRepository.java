package com.meuprojeto.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.cursospring.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}

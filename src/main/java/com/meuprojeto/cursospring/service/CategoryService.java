package com.meuprojeto.cursospring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuprojeto.cursospring.entity.Category;
import com.meuprojeto.cursospring.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository userRepository;

	public List<Category> findAll() {
		return userRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = userRepository.findById(id);
		return obj.get();
	}
	
}

package com.example.SpringSecurityNewChanges.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityNewChanges.entities.Product;
import com.example.SpringSecurityNewChanges.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProduct(int id) {
		return repo.findById(id).get();
	}
	
	

}

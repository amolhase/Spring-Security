package com.example.SpringSecurityNewChanges.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityNewChanges.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}

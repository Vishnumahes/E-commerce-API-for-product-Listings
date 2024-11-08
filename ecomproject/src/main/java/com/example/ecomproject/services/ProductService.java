package com.example.ecomproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecomproject.models.Product;
import com.example.ecomproject.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
}

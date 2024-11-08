package com.example.ecomproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecomproject.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	

}

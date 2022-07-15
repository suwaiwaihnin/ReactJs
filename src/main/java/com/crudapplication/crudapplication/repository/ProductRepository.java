package com.crudapplication.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapplication.crudapplication.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}





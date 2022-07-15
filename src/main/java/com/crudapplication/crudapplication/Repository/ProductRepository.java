package com.crudapplication.crudapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapplication.crudapplication.Domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}





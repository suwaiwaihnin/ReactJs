package com.CRUDApplication.CRUDApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUDApplication.CRUDApplication.Domain.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}





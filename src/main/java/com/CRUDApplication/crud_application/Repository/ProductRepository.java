package com.CRUDApplication.crud_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUDApplication.crud_application.Domain.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}





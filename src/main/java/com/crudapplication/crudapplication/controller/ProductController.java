package com.crudapplication.crudapplication.controller;

import java.util.*;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.crudapplication.crudapplication.domain.Product;
import com.crudapplication.crudapplication.service.ProductService;
import com.fasterxml.jackson.annotation.JsonIgnore;
 
@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    
    //Get All Products
    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
    
    //Get Product By id
    @GetMapping("/products/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id) {
        try {
            Product product = service.get(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
        	return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("No Data!");
        
        }      
    }
    
    //Create Product
    @PostMapping("/products")
    public ResponseEntity<?> add(@Valid @RequestBody Product product) {  
    	try {
    		 service.save(product);
    		 return ResponseEntity
                     .status(HttpStatus.OK)
                     .body("Product Create Successfully!");
  	} catch (NoSuchElementException e) {
  		return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Please Insert Again!");
        }      
       
    }
        
    //Update Product
    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid Product product, @PathVariable Integer id) {
        try {
            Product existProduct = service.get(id);
            existProduct.setProduct_name(product.getProduct_name());
            existProduct.setPrice(product.getPrice());
            service.save(existProduct);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Product Update Successfully!");
        } catch (NoSuchElementException e) {
        	return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Please Update Again!");
        }      
    }
    
    //Delete Product
    @DeleteMapping("/products/{id}")
    public ResponseEntity<?>delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Delete Product Successfully!");
    }
}

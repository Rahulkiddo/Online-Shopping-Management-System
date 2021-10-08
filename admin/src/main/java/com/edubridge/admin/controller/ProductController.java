package com.edubridge.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.admin.entities.Product;
import com.edubridge.admin.exceptiom.InvalidInputException;
import com.edubridge.admin.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/pro/add")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/pro/product")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping("/pro/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id +" is not a valid Prodct ID");
		}
			Product product = productService.getProductById(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}
	
	
	@DeleteMapping("/pro/{id}")
	public String deleteProduct(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id +" is not a valid Prodct ID");
		}
		productService.deleteProduct(id);
		return "Deleted Successfully";
	}
	
	@PutMapping("/pro/{id}")
	public ResponseEntity<Product> updateProduct (@PathVariable(value ="id") int proId, @RequestBody Product product) {
		if(proId <= 0) {
			throw new InvalidInputException(proId+" is not a valid Prodct ID");
		}
		Product updatedProduct = productService.updateProduct(proId, product);
		return ResponseEntity.ok(updatedProduct);
	}

}

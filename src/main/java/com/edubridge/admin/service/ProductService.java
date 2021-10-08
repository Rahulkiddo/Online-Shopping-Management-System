package com.edubridge.admin.service;

import java.util.List;

import com.edubridge.admin.entities.Product;

public interface ProductService {

    public Product saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Product getProductById( int proId);
	
	public Product updateProduct(int proId , Product product);
	
	public void deleteProduct(int proId);
	
	

}

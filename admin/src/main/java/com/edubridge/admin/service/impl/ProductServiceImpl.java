package com.edubridge.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.admin.entities.Product;
import com.edubridge.admin.exceptiom.RecordNotFoundException;
import com.edubridge.admin.repository.ProductRepository;
import com.edubridge.admin.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}
	@Override
	public Product getProductById(int proId) {
		return productRepo.findById(proId)
				.orElseThrow(() -> new RecordNotFoundException("Product with "+proId+" not Found"));
	}
	@Override
	public Product updateProduct(int proId , Product product) {
		Product p1 = getProductById(proId);
		p1.setProName(product.getProName());
		return productRepo.save(p1);
	}
	@Override
	public void deleteProduct(int proId) {
		productRepo.deleteById(proId);
		
	}

}

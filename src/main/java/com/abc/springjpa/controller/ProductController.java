package com.abc.springjpa.controller;

import com.abc.springjpa.entity.Product;
import com.abc.springjpa.service.ProductServiceImpl;

public class ProductController {
	
	private ProductServiceImpl productService;
	
	public void setProductService(ProductServiceImpl productService) {
		this.productService = productService;
	}
	
	public void addProduct(Product product) {
		
		productService.saveProduct(product);
		
		System.out.println("Product Saved");
	}

}

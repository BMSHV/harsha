package com.abc.springjpa.service;

import org.springframework.transaction.annotation.Transactional;

import com.abc.springjpa.dao.ProductDaoImpl;
import com.abc.springjpa.entity.Product;

public class ProductServiceImpl {
	
	private ProductDaoImpl productDao;
	
	public void setProductDao(ProductDaoImpl productDao) {
		this.productDao = productDao;
	}
	
	@Transactional
	public void saveProduct(Product product) {
		productDao.save(product);
	}

}

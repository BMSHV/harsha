package com.abc.springjpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.abc.springjpa.entity.Product;

public class ProductDaoImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Product product) {
		
		entityManager.persist(product);
		
	}

}

package com.abc.springjpa;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springjpa.controller.ProductController;
import com.abc.springjpa.entity.Product;

public class ProductControllerMain {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		//product.setProductId(0);
		product.setProductName("IphoneX");
		product.setProductPrice(15999);
		product.setProductCategory("Mobile");
		product.setCreatedAt(LocalDate.of(2015,10,24));
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		ProductController productController = (ProductController) context.getBean("pController");
		
		productController.addProduct(product);
		
		context.close();
				
	}
}

package com.cap.hibernate.HibernateAssesment;

import org.hibernate.Session;

import Entity.Product;

public class UpdateProduct {
	public void updateProduct(Session session, long id, double newPrice) {
		RetriveFromDatabase retrive = new RetriveFromDatabase();
		Product product = retrive.retriveProduct(session, id);
		product.setPrice(newPrice);
		System.out.println("Product price updated successfully");
		
	}

}

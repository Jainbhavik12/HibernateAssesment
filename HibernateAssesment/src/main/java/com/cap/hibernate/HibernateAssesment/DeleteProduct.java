package com.cap.hibernate.HibernateAssesment;

import org.hibernate.Session;

import Entity.Product;

public class DeleteProduct {
	public void deleteProduct(Session session, long id) {
		RetriveFromDatabase retrive = new RetriveFromDatabase();
		Product product = retrive.retriveProduct(session, id);
		session.delete(product);
		System.out.println("Product deleted successfully");
	}
}

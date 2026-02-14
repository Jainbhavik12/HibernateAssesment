package com.cap.hibernate.HibernateAssesment;

import org.hibernate.Session;

import Entity.Product;

public class AddToDataBase {
	
	public void addToDB(Session session, Product product) {
		session.persist(product);
		System.out.println("Product added successfully");
	}
}

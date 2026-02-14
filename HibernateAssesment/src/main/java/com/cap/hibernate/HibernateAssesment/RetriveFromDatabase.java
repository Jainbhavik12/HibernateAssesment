package com.cap.hibernate.HibernateAssesment;



import org.hibernate.Session;

import Entity.Product;

public class RetriveFromDatabase {
	public Product retriveProduct(Session session, long id) {
		Product product = session.get(Product.class, id);
		return product;
	}

}

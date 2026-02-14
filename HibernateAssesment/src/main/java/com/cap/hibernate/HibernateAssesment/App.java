package com.cap.hibernate.HibernateAssesment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Product;



public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        
        SessionFactory factory = configuration.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Product product1 = new Product("Laptop", "RAM = 16GB, SSD 512GB, RTX9020", "Electronics", 1, 70000.00, "ABC-SAM-LAP", true);
        Product product2 = new Product("TV", "HD, OLED Display, Dolby speakers", "Electronics", 1, 25000, "ABC-SONY-TV", true);
        Product product3 = new Product("Book", "350 Pages", "Stationary", 2, 250, "ABC-PQR-BOOK", false);
        Product product4 = new Product("Phone", "RAM = 8GB, Internal memory 256GB", "Electronics", 1, 35000, "ABC-APPLE-PHONE", true);
       
        Transaction txn = session.beginTransaction();
        
        //Adding to databse
        AddToDataBase add = new AddToDataBase();
        add.addToDB(session, product1);
        add.addToDB(session, product2);
        add.addToDB(session, product3);
        add.addToDB(session, product4);
        
        
        //retriving
//        RetriveFromDatabase retrive = new RetriveFromDatabase();
//        Product product = retrive.retriveProduct(session, 0);
//        
//        //updating
//        UpdateProduct update = new UpdateProduct();
//        update.updateProduct(session, 1, 27000.0);
        
        //Deleting
//        DeleteProduct delete = new DeleteProduct();
//        delete.deleteProduct(session, 2);
        txn.commit();
        session.close();
        factory.close();
        
        
    }
}


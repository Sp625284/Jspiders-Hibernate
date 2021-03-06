package com.crud.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothSaveDao {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		ClothDto jeans = new ClothDto();
		jeans.setBrand("pepe");
		// jeans.setId(1);
		jeans.setPrice(2500.00);
		jeans.setType("jeans");
		jeans.setColor("blue");

		Transaction transaction = session.beginTransaction();
		
		int serilPk = (int)session.save(jeans);
		transaction.commit();

		session.close();
		sf.close();

		System.out.println("App end");

	}

	
	
	
	
	
	
}

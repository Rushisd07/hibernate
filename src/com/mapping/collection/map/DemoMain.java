package com.mapping.collection.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		//write a query to find all the Disk objects
		Transaction tx = s.beginTransaction();
		
		Book b1 = new Book();
		b1.setBk_name("Vevcode");
		b1.setPublisher("Viraj");
		Map<String,Integer> m1 = new HashMap<>();
		m1.put("Author1",1);
		m1.put("Author2",2);
		b1.setAuthor(m1);
		
		Book b2 = new Book();
		b2.setBk_name("Java");
		b2.setPublisher("Nikhil");
		Map<String,Integer> m2 = new HashMap<>();
		m2.put("Author1",1);
		m2.put("Author3",3);
		b2.setAuthor(m2);
		
		s.persist(b1);
		tx.commit();
		
		Query q = s.createQuery("from Book");
		System.out.println("Success..");
		
		
	}

}

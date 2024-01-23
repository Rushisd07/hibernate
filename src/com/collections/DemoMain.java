package com.collections;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Set<String> s1 = new HashSet<String>();
		s1.add("Rushi");
		
		Book b1 = new Book();
		b1.setBk_name("Java");
		b1.setPublisher("vevcode");
		
		b1.setAuthor(s1);
		
		s.persist(b1);
		
		tx.commit();
		System.out.println("success");	
		
	}

}

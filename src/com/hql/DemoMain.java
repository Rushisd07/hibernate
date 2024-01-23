package com.hql;

import java.util.List;

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
		
		//Write a query to find all the disk object
//		Query q = s.createQuery("from Disk");	//Name of POJO class
//		System.out.println(q.list());
//		
//		List<Disk> l = q.list();
//		for(Disk d:l) {
//			System.out.println(d.getDskName()+" "+d.getDskType()+" "+d.getDskPrice());
//		}
//		
//		//write HQL query to find out the average price for all objects
//		Query q2 = s.createQuery("select avg(dskPrice) from Disk");
//		System.out.println(q2.uniqueResult());
//		
//		Query q3 = s.createQuery("select avg(dskPrice) from Disk group by dskType");
//		System.out.println(q3.list());
		
		//Execute Update query to set or edit column names
//		Transaction tx = s.beginTransaction();
//		Query q4 = s.createQuery("update Disk set dskPrice = (dskPrice+50) where dskId = 1");
//		System.out.println(q4.executeUpdate());
//		
//		tx.commit();
		
//		//Pagination ---used to retrive records from starting index to ending or max index
//	Query q5 = s.createQuery("from Disk");
//	q5.setFirstResult(1);
//		q5.setMaxResults(3);
//		System.out.println(q5.list());
		
//		System.out.println("Successful");		
		
		//HQL query which will list out only audio objects
//		Query q6 = s.createQuery("from Disk where dskType=:type");
//		q6.setParameter("type", "audio");
//		System.out.println(q6.list());
		
		//HQL query that will list out video object whose price is > 300
		Query q7 = s.createQuery("from Disk where dskType=:type and dskPrice > :pr");
		q7.setParameter("type", "video");
		q7.setParameter("pr", 300);
		
		System.out.println(q7.list());
		
		
		
	}

}

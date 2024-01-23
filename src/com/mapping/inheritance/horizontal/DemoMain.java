package com.mapping.inheritance.horizontal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mapping.inheritance.horizontal.AudioDisc;
import com.mapping.inheritance.horizontal.VideoDisc;
import com.mapping.inheritance.horizontal.Disc;

public class DemoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Disc d = new Disc();
		d.setName("Java");
		d.setPrice(200);
		s.persist(d);
		
		AudioDisc ad = new AudioDisc();
		ad.setName("Nikhil");
		ad.setPrice(100);
		ad.setSingerName("Rushi");
		ad.setNoOfSongs(10);
		s.persist(ad);
		
		VideoDisc vd = new VideoDisc();
		vd.setName("Sushant");
		vd.setPrice(250);
		vd.setDirector("Vijay");
		vd.setVideoFormat("mp4");
		s.persist(vd);
		
		tx.commit();
		
		Query q = s.createQuery("from Disc");
		System.out.println(q.list());
		
	}

}

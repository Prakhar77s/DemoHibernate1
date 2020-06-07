package com.prakhar.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest{
	public static void main(String[]args) {
		Testc1 obj1=new Testc1();
		obj1.setId(1);
		obj1.setName("Prakhar");
		obj1.setColor("Blue");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Testc1.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(obj1);
		tx.commit();
	}
}

package org.ashish.hibernamte;

import org.ashish.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernamteTest {

	public static void main(String[] args) {
		UserDetails user1 = new UserDetails();
		user1.setUserId(1);
		user1.setUserName("FirstUser");
		UserDetails user2 = new UserDetails();
		user2.setUserId(2);
		user2.setUserName("SecondUser");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
	}

}

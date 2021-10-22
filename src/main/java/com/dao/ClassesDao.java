package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Classes;

public class ClassesDao {
	SessionFactory sFactory;

	public ClassesDao() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sFactory = configuration.buildSessionFactory();
	}
	
	public boolean addClass(Classes classes) {
		try {
			Session session = sFactory.openSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
				session.save(classes);
			transaction.commit();
			return true;
		} catch (Exception e) {
			System.out.print(false);
			return false;
		}
	}
	
	public List<Classes> getAllRecord(){
		Session session = sFactory.openSession();
		Query<Classes> query = session.createQuery("select c from Classes c");
		List<Classes> listOfClasses = query.list();
		return listOfClasses;
	}
}

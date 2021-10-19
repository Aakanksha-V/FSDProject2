package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {

	SessionFactory sFactory;
	
	public StudentDao() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sFactory = configuration.buildSessionFactory();
	}
	
	public boolean storeStudentRecord(Student student) {
		try {
			Session session = sFactory.openSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
				session.save(student);
			transaction.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}

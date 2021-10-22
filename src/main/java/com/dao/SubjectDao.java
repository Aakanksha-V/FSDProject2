package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Subject;

public class SubjectDao {
	SessionFactory sFactory;

	public SubjectDao() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sFactory = configuration.buildSessionFactory();
	}
	public List<Subject> getAllSubject(){
		Session session = sFactory.openSession();
		Query<Subject> query = session.createQuery("select sub from Subject sub");
		List<Subject> listOfSubject = query.list();
		return listOfSubject;
	}
	
}

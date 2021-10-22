package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Class_Subject;

public class Class_SubjectDao {
	SessionFactory sessionFactory;
	
	public Class_SubjectDao() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public boolean addSubjectToCLass(Class_Subject c) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
				session.save(c);
			transaction.commit();
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	public boolean addSubClasseachersT(Class_Subject c) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
				session.save(c);
			transaction.commit();
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	
	public List<Class_Subject> getAllRecord(){
		Session session = sessionFactory.openSession();
		Query<Class_Subject> query = session.createQuery("select s from class_subject s");
		List<Class_Subject> list = query.list();
		return list;
	}

}
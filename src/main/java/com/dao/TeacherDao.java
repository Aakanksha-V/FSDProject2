package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Teacher;

public class TeacherDao {

	SessionFactory sFactory;
	
	public TeacherDao() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sFactory = configuration.buildSessionFactory();
	}
	
	public boolean storeTeacher(Teacher teacher) {
		try {
			Session session = sFactory.openSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
				session.save(teacher);
			transaction.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public List<Teacher> getAllTeacher() {
		Session session = sFactory.openSession();
		Query<Teacher> query = session.createQuery("select t from Teacher t");
		List<Teacher> listOfTeachers = query.list();
		return listOfTeachers;
		
	}
}

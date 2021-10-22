package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
	
	public List<Student> getAllRecord(){
		System.out.print("Inside Student Dao");
		Session session  = sFactory.openSession();
		System.out.print(sFactory);
		Query qry = session.createQuery("select obj from student obj");
//		qry.setParameter("a", 26420);
		List<Student> listOfStudent = qry.list();
		Iterator<Student> iterator = listOfStudent.iterator();
		while (iterator.hasNext()) {
			Student s = (Student) iterator.next();
			System.out.println(s.getStudentId()+" "+s.getStudentName());
			
		}
		return listOfStudent;
	}
}

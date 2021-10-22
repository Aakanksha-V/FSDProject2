package com.dao;

import java.util.List;

import javax.persistence.EntityManager;

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
	
	public List<Object[]> getSubForClass(){
		Session session = sessionFactory.openSession();
		List<Object[]> resList = session.createNativeQuery("select c.classesname , s.subjectname from classes as c, subject as s, class_subject as cs where c.classesid = cs.class_id and s.subjectid = cs.subject_id order by c.classesname asc").list();
		return resList;
		
	}
	
	public List<Object[]> getReport(){
		Session session = sessionFactory.openSession();
		List<Object[]> result = session.createNativeQuery("select c.classesname, t.teachername, s.subjectname from classes as c, teacher as t, subject as s, class_subject as cs where c.classesid = cs.class_id and s.subjectid = cs.subject_id and t.teacherid = cs.teacher_id and t.teacherid != 0 order by cs.class_id").list();
		return result;
	}
	
	public List<Object[]> getReportStu(){
		Session session = sessionFactory.openSession();
		List<Object[]> result = session.createNativeQuery("select studentname, classesname, s.class_id from student as s, class_subject as cs, classes c where s.class_id = cs.class_id and s.class_id=c.classesid and cs.teacher_id != 0 order by cs.class_id").list();
		return result;
	}

}

package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Admin;

public class AdminDao {
SessionFactory sFactory;
	
	public AdminDao() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sFactory = configuration.buildSessionFactory();
	}
	
	public boolean signIn(Admin admin){
        Session session = sFactory.openSession();
        Query<Admin> qry = session.createQuery("select obj from Admin obj where obj.email = :a and obj.pass = :b");
        qry.setParameter("a", admin.getEmail()); 
        qry.setParameter("b", admin.getPass()); 
        List<Admin> list = qry.list();
        if(list.size() > 0)
        	return true;
        else
        	return false;
    }	
}

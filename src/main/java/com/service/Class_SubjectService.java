package com.service;

import java.util.List;

import com.dao.Class_SubjectDao;
import com.entity.Class_Subject;

public class Class_SubjectService {
	
	Class_SubjectDao class_SubjectDao = new Class_SubjectDao();
	
	public boolean addSubjectToCLass(Class_Subject s) {
		if(class_SubjectDao.addSubjectToCLass(s)) {
			System.out.println("Added subject to class");
			return true;
		}
			
		else {
			System.out.println("Not Added!");
			return false;
		}
			
	}
	
	public boolean addSubClasseachersT(Class_Subject s) {
		if(class_SubjectDao.addSubClasseachersT(s)) {
			System.out.println("Added subject and teacher to class");
			return true;
		}
			
		else {
			System.out.println("Not Added!");
			return false;
		}
			
	}
	
	public List<Class_Subject> getAllRecord(){
		return class_SubjectDao.getAllRecord();
	}
	
	public List<Object[]> getSubForClass(){
		return class_SubjectDao.getSubForClass();
	}
	
	public List<Object[]> getReport(){
		return class_SubjectDao.getReport();
	}
	
	public List<Object[]> getReportStu(){
		return class_SubjectDao.getReportStu();
	}

}

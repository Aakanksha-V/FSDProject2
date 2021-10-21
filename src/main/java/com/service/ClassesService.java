package com.service;

import java.util.List;

import com.dao.ClassesDao;
import com.entity.Classes;

public class ClassesService {
	
	ClassesDao classesDao = new ClassesDao();
	
	public String addClass(Classes classes) {
		if(classesDao.addClass(classes))
			return "Class added";
		else
			return "Class not added";
	}
	
	public List<Classes> getAllClasses() {
		return classesDao.getAllRecord();
	}
}

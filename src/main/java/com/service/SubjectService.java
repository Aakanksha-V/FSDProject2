package com.service;

import java.util.List;

import com.dao.SubjectDao;
import com.entity.Subject;

public class SubjectService {
SubjectDao subjectDao = new SubjectDao();
	
//	public String addSubject(Subject subject) {
//		if(SubjectDao.addSubject(subject))
//			return "Subject added";
//		else
//			return "Subject not added";
//	}
	
	public List<Subject> getAllSubject() {
		return subjectDao.getAllSubject();
	}
}

package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	
	public String sotreStudentRecord(Student student) {
		if(studentDao.storeStudentRecord(student))
			return "New Student added";
		else
			return "Student didn't added!!!";
	}
	
	public List<Student> getAllRecord() {
		return studentDao.getAllRecord();
	}

}

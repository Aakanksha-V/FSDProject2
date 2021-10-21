package com.service;

import com.dao.TeacherDao;
import com.entity.Teacher;

public class TeacherService {
	
	TeacherDao teacherDao = new TeacherDao();
	
	public String storeTeacher(Teacher teacher) {
		if(teacherDao.storeTeacher(teacher))
			return "Teacher added!";
		else 
			return "Teacher didn't added";
	}
}

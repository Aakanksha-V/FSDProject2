package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class_Subject {
	
	@Id
	private int class_id;
	private int subject_id;
	private int teacher_id;
	
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public Class_Subject() {
		super();
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

}

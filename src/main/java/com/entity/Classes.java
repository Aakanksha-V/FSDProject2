package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classes {
	
	@Id
	private int classesId;
	private String classesName;
	
	public Classes() {
		super();
	}
	public Classes(int classId, String className) {
		super();
		this.classesId = classId;
		this.classesName = className;
	}
	public int getClassId() {
		return classesId;
	}
	public void setClassId(int classId) {
		this.classesId = classId;
	}
	public String getClassName() {
		return classesName;
	}
	public void setClassName(String className) {
		this.classesName = className;
	}

}

package com.service;

import com.dao.AdminDao;
import com.entity.Admin;

public class AdminService {
	
	AdminDao adminDao = new AdminDao();
	
	public boolean signIn(Admin admin) {
		if(adminDao.signIn(admin)) {
			return true;
		}
		else {
			return false;
		}
	}

}

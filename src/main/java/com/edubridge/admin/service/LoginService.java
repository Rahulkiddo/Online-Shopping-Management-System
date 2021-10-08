package com.edubridge.admin.service;

import java.util.List;

import com.edubridge.admin.entities.Login;


public interface LoginService {
	
	    public Login saveLogin( Login login);
		
		public List<Login> getAllLogin();
		
		

}

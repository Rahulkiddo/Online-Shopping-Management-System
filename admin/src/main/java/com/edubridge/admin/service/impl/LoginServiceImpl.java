package com.edubridge.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.admin.entities.Login;
import com.edubridge.admin.repository.LoginRepository;
import com.edubridge.admin.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepository loginRepo;

	@Override
	public Login saveLogin(Login login) {
		return loginRepo.save(login);
	}

	@Override
	public List<Login> getAllLogin() {
		return loginRepo.findAll();
	}

	
}

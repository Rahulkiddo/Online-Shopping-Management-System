package com.edubridge.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.admin.entities.Login;
import com.edubridge.admin.service.LoginService;


@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	

	@PostMapping("/log/add")
	public Login saveLogin(@RequestBody Login login) {
		return loginService.saveLogin(login);
	}
	
	@GetMapping("/log/login")
	public List<Login> getAllLogin() {
	return loginService.getAllLogin();
	}

}

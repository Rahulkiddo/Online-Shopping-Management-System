package com.edubridge.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubridge.admin.entities.Login;
import com.edubridge.admin.service.LoginService;

@Controller
public class LoginViewController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/")
	public String viewAdminloginPage(Model model) {
		Login login = new Login();
		model.addAttribute(model);
		return "Adminlogin";
	}

}

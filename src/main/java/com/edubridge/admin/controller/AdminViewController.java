package com.edubridge.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubridge.admin.entities.Admin;
import com.edubridge.admin.entities.Member;
import com.edubridge.admin.service.AdminService;

@Controller
public class AdminViewController {
	
	@Autowired
	AdminService adminService;
	
/*	
	@RequestMapping("/new")
	public String viewIndexPage(Model model) {
		List<Admin> adminList = adminService.getAllAdmin();
		model.addAttribute("adminList",adminList);
		return " index";
	}
	*/
	
	@RequestMapping("/new")
	public String viewIndexPage(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "index";
	}
	

	
	
	@RequestMapping("/dea")
	public String viewAdminPage(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "new_dealer";
	}
	
	@RequestMapping("/use")
	public String viewMemberPage(Model model) {
		Member member = new Member();
		model.addAttribute(model);
		return "view_users";
	}
	
}

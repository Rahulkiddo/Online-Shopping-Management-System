package com.edubridge.admin.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.admin.entities.Admin;
import com.edubridge.admin.exceptiom.InvalidInputException;
import com.edubridge.admin.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/adm/add")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	
	@GetMapping("/adm/admin")
	public List<Admin> getAllAdmin() {
	return adminService.getAllAdmin();
	}
	
	@GetMapping("/adm/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id +" is not a valid Dealer ID");
		}
		Admin Admin = adminService.getAdminById(id);

			return new ResponseEntity<Admin>(Admin, HttpStatus.NOT_FOUND);
		}
	
	
	@DeleteMapping("/adm/{id}")
	public String deleteAdmin(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id +" is not a valid Dealer ID");
		}
		adminService.deleteAdmin(id);
		return "Deleted Successfully";
	}
	
	@PutMapping("/adm/{id}")
	public ResponseEntity<Admin> updateAdmin (@PathVariable(value ="id") int dealerId , @RequestBody Admin admin) {
		if(dealerId <= 0) {
			throw new InvalidInputException(dealerId +" is not a valid Dealer ID");
		}
		Admin updatedAdmin = adminService.updateAdmin(dealerId, admin);
		return ResponseEntity.ok(updatedAdmin);
	}
}

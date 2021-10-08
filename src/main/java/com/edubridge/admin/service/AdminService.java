package com.edubridge.admin.service;

import java.util.List;

import com.edubridge.admin.entities.Admin;


public interface AdminService {
	
    public Admin saveAdmin(Admin admin);
	
	public List<Admin> getAllAdmin();
	
	public Admin getAdminById( int dealerId);
	
	public Admin updateAdmin(int dealerId , Admin admin);
	
	public void deleteAdmin(int dealerId);
	

}

package com.edubridge.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.admin.entities.Admin;
import com.edubridge.admin.exceptiom.RecordNotFoundException;
import com.edubridge.admin.repository.AdminRepository;
import com.edubridge.admin.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepo;

	@Override
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepo.findAll();
	}

	@Override
	public Admin getAdminById(int dealerId) {
		return adminRepo.findById(dealerId)
				.orElseThrow(() -> new RecordNotFoundException("Product with "+dealerId+" not Found"));

	}

	@Override
	public Admin updateAdmin(int dealerId, Admin admin) {
        Admin a1 = getAdminById(dealerId);
        a1.setDealerName(admin.getDealerName());
		return adminRepo.save(a1);
	}

	@Override
	public void deleteAdmin(int dealerId) {
		adminRepo.deleteById(dealerId);
		
	}

}

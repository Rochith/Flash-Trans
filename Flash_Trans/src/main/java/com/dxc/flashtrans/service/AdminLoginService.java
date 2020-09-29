package com.dxc.flashtrans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.AdminLogin;
import com.dxc.flashtrans.repository.IAdminLogin;

@Service
public class AdminLoginService implements IAdminLoginService {
	
	@Autowired
	AdminLogin log;
	
	@Autowired
	IAdminLogin admin;

	@Override
	public List<AdminLogin> getAllTransactions() {
		
		return admin.findAll();
	}


	@Override
	public AdminLogin adminDeposit(AdminLogin adminlogin) {
	
		return admin.save(adminlogin);
	}

}

package com.dxc.flashtrans.service;

import java.util.List;

import com.dxc.flashtrans.entites.AdminLogin;

public interface IAdminLoginService {
	
	public List<AdminLogin> getAllTransactions();
	
	public AdminLogin adminDeposit(AdminLogin adminlogin);

}

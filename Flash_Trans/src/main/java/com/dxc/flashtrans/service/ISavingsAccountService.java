package com.dxc.flashtrans.service;

import java.util.List;

import com.dxc.flashtrans.entity.SavingsAccount;

public interface ISavingsAccountService {
	
	public List<SavingsAccount> miniStatement();
	
	public List<SavingsAccount> eStatement();

}

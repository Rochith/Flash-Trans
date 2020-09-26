package com.dxc.flashtrans.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entity.SavingsAccount;
import com.dxc.flashtrans.repository.ISavingsAccount;

@Service
public class SavingsAccountService implements ISavingsAccountService {
	
	@Autowired
	ISavingsAccount savings;
	
	@Autowired
	SavingsAccount save;

	@Override
	public List<SavingsAccount> miniStatement() {
		
		return savings.findAll();
	}

	@Override
	public List<SavingsAccount> eStatement() {
		
		return savings.findAll();
	}

	

}

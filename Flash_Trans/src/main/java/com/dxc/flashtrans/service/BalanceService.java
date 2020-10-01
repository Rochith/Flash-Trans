package com.dxc.flashtrans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.Balance;
import com.dxc.flashtrans.repository.IBalance;

@Service 
public class BalanceService implements IBalanceService {
	
	@Autowired
	Balance balance;
	
	@Autowired
	IBalance balancerepo;

	@Override
	public List<Balance> getBalance() {
		// TODO Auto-generated method stub
		return balancerepo.findAll();
	}



}

package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entity.FixedDepositAccount;
import com.dxc.flashtrans.repository.IFixedDepositAccount;

@Service
public class FixedDepositService implements IFixedDepositService {
	
	@Autowired
	FixedDepositAccount fdaccount;
	
	@Autowired
	IFixedDepositAccount fdrepo;

	@Override
	public FixedDepositAccount depositAmount(FixedDepositAccount fixeddepositaccount) {
		
		return fdrepo.save(fixeddepositaccount);
	}
}

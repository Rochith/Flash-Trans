package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.FixedDepositAccount;
import com.dxc.flashtrans.exceptions.FixedDepositException;
import com.dxc.flashtrans.repository.IFixedDepositAccount;

@Service
public class FixedDepositService implements IFixedDepositService {
	
	@Autowired
	FixedDepositAccount fdaccount;
	
	@Autowired
	IFixedDepositAccount fdrepo;

	@Override
	public FixedDepositAccount depositAmount(FixedDepositAccount fixeddepositaccount) throws FixedDepositException {
		
		FixedDepositAccount isValid = validateFixedDeposit(fixeddepositaccount);
		if(isValid != null) {
			return fdrepo.save(fixeddepositaccount);
		}else {
			throw new FixedDepositException("Fixed Deposite failed....");
		}
	}
	private FixedDepositAccount validateFixedDeposit(FixedDepositAccount fixeddepositaccount) {
		if((fixeddepositaccount.getTransactionPin()>=1000 && fixeddepositaccount.getTransactionPin()<=9999) 
				&& (fixeddepositaccount.getBalanceAmount()>=1000)) {
			return fixeddepositaccount;
		}
		return null;
	}
}

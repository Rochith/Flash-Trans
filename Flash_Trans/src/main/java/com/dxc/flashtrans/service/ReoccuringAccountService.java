package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.ReoccuringAccount;
import com.dxc.flashtrans.exceptions.ReoccuringAccountException;
import com.dxc.flashtrans.repository.IReoccuringAccount;

@Service
public class ReoccuringAccountService implements IReoccuringAccountService {
	
	@Autowired
	IReoccuringAccount rdrepo;
	
	@Autowired
	ReoccuringAccount rdaccount;

	@Override
	public ReoccuringAccount depositAmount(ReoccuringAccount reoccuringaccount) throws ReoccuringAccountException {
		
		ReoccuringAccount isValid = validateReoccuringAccount(reoccuringaccount);
		if(isValid != null) {
			return rdrepo.save(reoccuringaccount);
		}else {
			throw new ReoccuringAccountException("Reoccuring Deposit failed.....");
		}
	}
	private ReoccuringAccount validateReoccuringAccount(ReoccuringAccount reoccuringaccount) {
		if((reoccuringaccount.getTransactionPin()>=1000 && reoccuringaccount.getTransactionPin()<=9999)) {
			return reoccuringaccount;
		}
		return null;
	}

}

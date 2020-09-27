package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entity.ReoccuringAccount;
import com.dxc.flashtrans.repository.IReoccuringAccount;

@Service
public class ReoccuringAccountService implements IReoccuringAccountService {
	
	@Autowired
	IReoccuringAccount rdrepo;
	
	@Autowired
	ReoccuringAccount rdaccount;

	@Override
	public ReoccuringAccount depositAmount(ReoccuringAccount reoccuringaccount) {
		
		return rdrepo.save(reoccuringaccount);
	}

}

package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.WithDraw;
import com.dxc.flashtrans.exceptions.WithDrawException;
import com.dxc.flashtrans.repository.IWithDraw;

@Service
public class WithDrawService implements IWithDrawService {
	
	@Autowired
	IWithDraw repo;
	
	@Autowired
	WithDraw withd;

	@Override
	public WithDraw addAmount(WithDraw withdraw) throws WithDrawException {
		
		WithDraw isValid = validateWithDraw(withdraw);
		if(isValid != null) {
			return repo.save(withdraw);
		}else {
			throw new WithDrawException("WithDraw failed");
		}
		
	}
	private WithDraw validateWithDraw(WithDraw withdraw) {
		if((withdraw.getTransactionPin()>=1000 && withdraw.getTransactionPin()<=9999)) {
			return withdraw;
		}
		return null;
	}

}

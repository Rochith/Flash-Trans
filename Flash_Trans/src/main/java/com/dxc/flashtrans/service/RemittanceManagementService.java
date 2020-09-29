package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.RemittanceManagement;
import com.dxc.flashtrans.exceptions.RemittanceManagementException;
import com.dxc.flashtrans.repository.IRemittanceManagement;

@Service
public class RemittanceManagementService implements IRemittanceManagementService {
	
	@Autowired
	RemittanceManagement remi;
	
	@Autowired
	IRemittanceManagement remirepo;

	@Override
	public RemittanceManagement addAccount(RemittanceManagement remittancemanagement) throws RemittanceManagementException {
		
		RemittanceManagement isValid = validateRemittanceManagement(remittancemanagement);
		
		if(isValid != null) {
			
			return remirepo.save(remittancemanagement);
			
		}else {
			
			throw new RemittanceManagementException("Transfer Failed");
			
		}
	}
	private RemittanceManagement validateRemittanceManagement(RemittanceManagement remittancemanagement) {
		
		if((remittancemanagement.getCardNo()>1000000000000000l && remittancemanagement.getCardNo()<9999999999999999l)) {
			
			return remittancemanagement;
		}
		
		return null;
	}

}

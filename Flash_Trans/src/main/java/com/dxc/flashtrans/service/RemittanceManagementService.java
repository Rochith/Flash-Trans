package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entity.RemittanceManagement;
import com.dxc.flashtrans.repository.IRemittanceManagement;

@Service
public class RemittanceManagementService implements IRemittanceManagementService {
	
	@Autowired
	RemittanceManagement remi;
	
	@Autowired
	IRemittanceManagement remirepo;

	@Override
	public RemittanceManagement addAccount(RemittanceManagement remittancemanagement) {
		
		return remirepo.save(remittancemanagement);
	}

}

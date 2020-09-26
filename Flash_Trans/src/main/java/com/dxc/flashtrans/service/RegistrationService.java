package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entity.Registration;
import com.dxc.flashtrans.repository.IRegistration;

@Service
public class RegistrationService implements IRegistrationService {
	
	@Autowired
	Registration user;
	
	@Autowired
	IRegistration data;

	@Override
	public Registration userRegistration(Registration registration) {
		
		return data.save(registration);
	}

}

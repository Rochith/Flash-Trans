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
	
		/*
		 * } public Registration validateRegistration(Registration registration) {
		 * if((registration.getFirstName().length()>=3) &&
		 * (registration.getAadharNumber().length()== 12 &&
		 * registration.getPhoneNumber().length() == 10 &&
		 * registration.getPassword().length() == 8 &&
		 * registration.gettransactionPin().length() == 4))
		 * 
		 * { return registration; } return null;
		 */
	}

}

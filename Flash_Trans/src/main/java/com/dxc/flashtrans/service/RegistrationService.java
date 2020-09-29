package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.Registration;
import com.dxc.flashtrans.exceptions.RegistrationException;
import com.dxc.flashtrans.repository.IRegistration;

@Service
public class RegistrationService implements IRegistrationService {
	
	@Autowired
	Registration user;
	
	@Autowired
	IRegistration data;

	@Override
	public Registration userRegistration(Registration registration) throws RegistrationException {
		
		Registration isValid = validateRegistration(registration);
		if(isValid != null) {
			return data.save(registration);
		}else {
			throw new RegistrationException("Registration Failed....");
		}
	
		
	}
	
	
      private Registration validateRegistration(Registration registration) {
		
		if((registration.getFirstName().length()>=3)&& (registration.getEmail().matches ("[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")

        && (registration.getPhoneNumber() >= 1000000000l && registration.getPhoneNumber() <= 9999999999l) && (registration.getPassword().matches("[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) 
        && (registration.gettransactionPin()>=1000 && registration.gettransactionPin()<=9999) && (registration.getAadharNumber()>=100000000000l && registration.getAadharNumber()<= 999999999999l))){
			
			return registration;
			
		}
		
		return null;
	}
}

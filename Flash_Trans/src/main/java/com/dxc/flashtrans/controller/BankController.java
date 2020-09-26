package com.dxc.flashtrans.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.flashtrans.entity.Registration;
import com.dxc.flashtrans.entity.SavingsAccount;
import com.dxc.flashtrans.service.RegistrationService;
import com.dxc.flashtrans.service.SavingsAccountService;

import io.swagger.annotations.ApiOperation;

@ApiOperation(value="/mvn",tags="Bank Controller with RestFull")
@RestController
@RequestMapping("/Bank")
public class BankController {
	
	@Autowired
	Registration registration;
	
	@Autowired
	RegistrationService RegService;
	
	@Autowired
	SavingsAccount savings;
	
	@Autowired
	SavingsAccountService savingsService;
	
	
	@ApiOperation(value="insert bank details",produces="json data",response=Registration.class)
	@PostMapping(path="/add")
	public Registration userRegistration(@RequestBody Registration registration) {
		return RegService.userRegistration(registration);
		
	}
	@ApiOperation(value="insert bank details",produces="json data",response=SavingsAccount.class)
	@GetMapping(path="/getmini")
	public List<SavingsAccount> miniStatement(){
		return savingsService.miniStatement();
		
	}
	@ApiOperation(value="insert bank details",produces="json data",response=SavingsAccount.class)
	@GetMapping(path="/gete")
	public List<SavingsAccount> eStatement(){
		return savingsService.eStatement();
		
	}

}

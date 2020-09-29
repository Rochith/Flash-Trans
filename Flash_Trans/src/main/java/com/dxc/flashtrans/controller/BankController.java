package com.dxc.flashtrans.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.flashtrans.entites.AdminLogin;
import com.dxc.flashtrans.entites.BillPayments;
import com.dxc.flashtrans.entites.FixedDepositAccount;
import com.dxc.flashtrans.entites.Registration;
import com.dxc.flashtrans.entites.RemittanceManagement;
import com.dxc.flashtrans.entites.ReoccuringAccount;
import com.dxc.flashtrans.entites.SavingsAccount;
import com.dxc.flashtrans.service.AdminLoginService;
import com.dxc.flashtrans.service.BillPaymentsService;
import com.dxc.flashtrans.service.FixedDepositService;
import com.dxc.flashtrans.service.RegistrationService;
import com.dxc.flashtrans.service.RemittanceManagementService;
import com.dxc.flashtrans.service.ReoccuringAccountService;
import com.dxc.flashtrans.service.SavingsAccountService;

//@ApiOperation(value="/mvn",tags="Bank Controller with RestFull")
@RestController
@RequestMapping("/Bank")
@CrossOrigin("http://localhost:4200")
public class BankController {
	
	@Autowired
	Registration registration;
	
	@Autowired
	RegistrationService Regservice;
	
	@Autowired
	SavingsAccount savings;
	
	@Autowired
	SavingsAccountService savingsservice;
	
	@Autowired
	AdminLogin admin;
	
	@Autowired
	AdminLoginService adminservice;
	
	@Autowired
	FixedDepositAccount fdaccount;
	
	@Autowired
	FixedDepositService fdservice;
	
	@Autowired
	ReoccuringAccount rdaccount;
	
	@Autowired
	ReoccuringAccountService rdservice;
	
	@Autowired
	RemittanceManagement remi;
	
	@Autowired
	RemittanceManagementService remiservice;
	
	@Autowired
	BillPayments bills;
	
	@Autowired
	BillPaymentsService billservice;
	
	//@ApiOperation(value="insert bank details",produces="json data",response=Registration.class)
	@PostMapping(path="/add")
	public Registration userRegistration(@RequestBody Registration registration) {
		return Regservice.userRegistration(registration);
		
	}
	//@ApiOperation(value="insert bank details",produces="json data",response=SavingsAccount.class)
	@GetMapping(path="/getmini")
	public List<SavingsAccount> miniStatement(){
		return savingsservice.miniStatement();
		
	}
	//@ApiOperation(value="insert bank details",produces="json data",response=SavingsAccount.class)
	@GetMapping(path="/gete")
	public List<SavingsAccount> eStatement(){
		return savingsservice.eStatement();
		
	}
	//@ApiOperation(value="insert bank details",produces="json data",response=AdminLogin.class)
	@PostMapping(path="/deposit")
	public AdminLogin adminDeposit( @RequestBody AdminLogin adminlogin) {
		return adminservice.adminDeposit(adminlogin);
		
	}
	//@ApiOperation(value="insert  bank details",produces="json data",response=AdminLogin.class)
	@GetMapping(path="/getTransacation")
	public List<AdminLogin> getAllTransaction(){
		return adminservice.getAllTransactions();
		
	}
	//@ApiOperation(value="insert bank details",produces="json data",response=FixedDepositAccount.class)
	@PostMapping(path="/fdadd")
	public FixedDepositAccount depositAmount( @RequestBody FixedDepositAccount fixeddepositaccount) {
		return fdservice.depositAmount(fixeddepositaccount);
		
	}
	//@ApiOperation(value="insert bank details",produces="json data",response=ReoccuringAccount.class)
	@PostMapping(path="/rdadd")
	public ReoccuringAccount depositAmount(@RequestBody ReoccuringAccount reoccuringaccount) {
		return rdservice.depositAmount(reoccuringaccount);
		
	}
	@PostMapping(path="/remiadd")
	public RemittanceManagement addAccount(@RequestBody RemittanceManagement remittancemanagement) {
		return remiservice.addAccount(remittancemanagement);
		
	}
	@PostMapping(path="/bill")
	public BillPayments addBills(@RequestBody BillPayments billpayments) {
		return billservice.addBills(billpayments);
	}

}

package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.BillPayments;
import com.dxc.flashtrans.exceptions.BillPaymentsException;
import com.dxc.flashtrans.repository.IBillPayments;

@Service
public class BillPaymentsService implements IBillPaymentsService {
	
	@Autowired
	BillPayments bill;
	
	@Autowired
	IBillPayments repobill;

	@Override
	public BillPayments addBills(BillPayments billpayments) throws BillPaymentsException {
		
		BillPayments isValid = validateBillPayments(billpayments);
		if(isValid != null) {
			return repobill.save(billpayments);
		}else {
			throw new BillPaymentsException("Bill Payments failed....");
		}
	}
	private BillPayments validateBillPayments(BillPayments billpayments) {
		if((billpayments.getTransactionPin()>=1000 && billpayments.getTransactionPin()<=9999) 
				&& (billpayments.getBillAmount()>10)) {
			return billpayments;
		}
		return null;
	}

}

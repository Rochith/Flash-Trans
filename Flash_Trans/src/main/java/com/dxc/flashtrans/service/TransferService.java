package com.dxc.flashtrans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.flashtrans.entites.Transfer;
import com.dxc.flashtrans.exceptions.TransferException;
import com.dxc.flashtrans.repository.ITransfer;

@Service 
public class TransferService implements ITransferService {
	
	@Autowired
	Transfer transfer;
	
	@Autowired
	ITransfer transferrepo;

	@Override
	public Transfer addTransfer(Transfer transfer) throws TransferException {
		Transfer isValid = validateTransfer(transfer);
		if(isValid != null) {
			return transferrepo.save(transfer);
		}else {
			throw new TransferException("Transfer Failed..");
		}
	}
	
	private Transfer validateTransfer(Transfer transfer) {
		if((transfer.getTransferAccount()>1000000000000000l && transfer.getTransferAccount()<9999999999999999l) && 
				(transfer.getTransactionPin()>=1000 && transfer.getTransactionPin()<=9999)
				&& transfer.getTransferAmount()>=1000) {
			return transfer;
		}
		return null;
	}
		

}

package com.dxc.flashtrans.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Transfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transferId;
	private String transferName;
	private long transferAccount;
	private long transferAmount;
	private int transactionPin;
	/**
	 * @return the transferId
	 */
	public long getTransferId() {
		return transferId;
	}
	/**
	 * @param transferId the transferId to set
	 */
	public void setTransferId(long transferId) {
		this.transferId = transferId;
	}
	/**
	 * @return the transferName
	 */
	public String getTransferName() {
		return transferName;
	}
	/**
	 * @param transferName the transferName to set
	 */
	public void setTransferName(String transferName) {
		this.transferName = transferName;
	}
	/**
	 * @return the transferAccount
	 */
	public long getTransferAccount() {
		return transferAccount;
	}
	/**
	 * @param transferAccount the transferAccount to set
	 */
	public void setTransferAccount(long transferAccount) {
		this.transferAccount = transferAccount;
	}
	/**
	 * @return the transferAmount
	 */
	public long getTransferAmount() {
		return transferAmount;
	}
	/**
	 * @param transferAmount the transferAmount to set
	 */
	public void setTransferAmount(long transferAmount) {
		this.transferAmount = transferAmount;
	}
	/**
	 * @return the transactionPin
	 */
	public int getTransactionPin() {
		return transactionPin;
	}
	/**
	 * @param transactionPin the transactionPin to set
	 */
	public void setTransactionPin(int transactionPin) {
		this.transactionPin = transactionPin;
	}
	@Override
	public String toString() {
		return "Transfer [transferId=" + transferId + ", transferName=" + transferName + ", transferAccount="
				+ transferAccount + ", transferAmount=" + transferAmount + ", transactionPin=" + transactionPin + "]";
	}
	

}

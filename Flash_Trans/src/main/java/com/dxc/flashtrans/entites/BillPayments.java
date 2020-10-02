package com.dxc.flashtrans.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class BillPayments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long billId;
	private String billType;
	private long billAmount;
	private int transactionPin;
	private long billNumber;
	/**
	 * @return the billId
	 */
	public long getBillId() {
		return billId;
	}
	/**
	 * @param billId the billId to set
	 */
	public void setBillId(long billId) {
		this.billId = billId;
	}
	/**
	 * @return the billType
	 */
	public String getBillType() {
		return billType;
	}
	/**
	 * @param billType the billType to set
	 */
	public void setBillType(String billType) {
		this.billType = billType;
	}
	/**
	 * @return the billAmount
	 */
	public long getBillAmount() {
		return billAmount;
	}
	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(long billAmount) {
		this.billAmount = billAmount;
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
	
	/**
	 * @return the billNumber
	 */
	public long getBillNumber() {
		return billNumber;
	}
	/**
	 * @param billNumber the billNumber to set
	 */
	public void setBillNumber(long billNumber) {
		this.billNumber = billNumber;
	}
	@Override
	public String toString() {
		return "BillPaymentsTest [billId=" + billId + ", billType=" + billType + ", billAmount=" + billAmount
				+ ", transactionPin=" + transactionPin + ", billNumber=" + billNumber + "]";
	}
	

}

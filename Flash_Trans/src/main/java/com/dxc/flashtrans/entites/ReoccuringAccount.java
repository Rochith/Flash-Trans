package com.dxc.flashtrans.entites;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class ReoccuringAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long reoccuringAccountId;
	private String rdName;
	private String transactionTDate;
	private String transactionFDate;
	private String transactionType;
	private int transactionPin;
	private long balanceAmount;
	/**
	 * @return the reoccuringAccountId
	 */
	public long getReoccuringAccountId() {
		return reoccuringAccountId;
	}
	/**
	 * @param reoccuringAccountId the reoccuringAccountId to set
	 */
	public void setReoccuringAccountId(long reoccuringAccountId) {
		this.reoccuringAccountId = reoccuringAccountId;
	}
	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionFDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionFDate = transactionDate;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the balanceAmount
	 */
	public long getBalanceAmount() {
		return balanceAmount;
	}
	/**
	 * @param balanceAmount the balanceAmount to set
	 */
	public void setBalanceAmount(long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	/**
	 * @return the transactionTDate
	 */
	public String getTransactionTDate() {
		return transactionTDate;
	}
	/**
	 * @param transactionTDate the transactionTDate to set
	 */
	public void setTransactionTDate(String transactionTDate) {
		this.transactionTDate = transactionTDate;
	}
	/**
	 * @return the rdName
	 */
	public String getRdName() {
		return rdName;
	}
	/**
	 * @param rdName the rdName to set
	 */
	public void setRdName(String rdName) {
		this.rdName = rdName;
	}
	
	@Override
	public String toString() {
		return "ReoccuringAccount [reoccuringAccountId=" + reoccuringAccountId + ", rdName=" + rdName
				+ ", transactionTDate=" + transactionTDate + ", transactionFDate=" + transactionFDate
				+ ", transactionType=" + transactionType + ", transactionPin=" + transactionPin + ", balanceAmount="
				+ balanceAmount + "]";
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
	
	
	

}
//account id, deposite amount(db) , withdraw amout(cr),balance amount, transaction date,loop every month payment

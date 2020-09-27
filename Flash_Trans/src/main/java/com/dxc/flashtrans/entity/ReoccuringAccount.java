package com.dxc.flashtrans.entity;

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
	//@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long reoccuringAccountId;
	private String transactionDate;
	private String transactionType;
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
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
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
	@Override
	public String toString() {
		return "ReoccuringAccount [reoccuringAccountId=" + reoccuringAccountId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", balanceAmount=" + balanceAmount + "]";
	}
	
	
	

}
//account id, deposite amount(db) , withdraw amout(cr),balance amount, transaction date,loop every month payment

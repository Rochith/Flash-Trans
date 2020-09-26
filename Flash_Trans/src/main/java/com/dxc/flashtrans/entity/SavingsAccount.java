package com.dxc.flashtrans.entity;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class SavingsAccount {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "savingsId", nullable = false, updatable = false)
	private long savingsId;
	private Date transactionDate;
	private String transactionType;
	private long balance;
	/**
	 * @return the savingsId
	 */
	public long getSavingsId() {
		return savingsId;
	}
	/**
	 * @param savingsId the savingsId to set
	 */
	public void setSavingsId(long savingsId) {
		this.savingsId = savingsId;
	}
	/**
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
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
	 * @return the balance
	 */
	public long getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [savingsId=" + savingsId + ", transactionDate=" + transactionDate + ", transactionType="
				+ transactionType + ", balance=" + balance + "]";
	}
	
}

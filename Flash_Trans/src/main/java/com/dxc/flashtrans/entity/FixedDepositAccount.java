package com.dxc.flashtrans.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class FixedDepositAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "savingsId", nullable = false, updatable = false)
	private long fixedDepositId;
	private Date transactionDate;
	private String transactionType;
	private long balanceAmount;
	/**
	 * @return the fixedDepositId
	 */
	public long getFixedDepositId() {
		return fixedDepositId;
	}
	/**
	 * @param fixedDepositId the fixedDepositId to set
	 */
	public void setFixedDepositId(long fixedDepositId) {
		this.fixedDepositId = fixedDepositId;
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
	public long getBalanceAmount() {
		return balanceAmount;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balanceAmount = balance;
	}
	@Override
	public String toString() {
		return "FixedDepositAccount [fixedDepositId=" + fixedDepositId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", balance=" + balanceAmount + "]";
	}
	
}

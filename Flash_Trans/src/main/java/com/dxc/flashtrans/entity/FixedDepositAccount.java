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
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fixedDepositId;
	private String transactionDate;
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
	 * @return the balance
	 */
	
	@Override
	public String toString() {
		return "FixedDepositAccount [fixedDepositId=" + fixedDepositId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", balance=" + balanceAmount + "]";
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
	
}

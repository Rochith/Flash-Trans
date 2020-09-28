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
	private long fixedDepositId;
	private String fdName;
	private String transactionFDate;
	private String transactionTDate;
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
	 * @return the fdName
	 */
	public String getFdName() {
		return fdName;
	}
	/**
	 * @param fdName the fdName to set
	 */
	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	/**
	 * @return the transactionFDate
	 */
	public String getTransactionFDate() {
		return transactionFDate;
	}
	/**
	 * @param transactionFDate the transactionFDate to set
	 */
	public void setTransactionFDate(String transactionFDate) {
		this.transactionFDate = transactionFDate;
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
		return "FixedDepositAccount [fixedDepositId=" + fixedDepositId + ", fdName=" + fdName + ", transactionFDate="
				+ transactionFDate + ", transactionTDate=" + transactionTDate + ", transactionType=" + transactionType
				+ ", balanceAmount=" + balanceAmount + "]";
	}
	
	
}

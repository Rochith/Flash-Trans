package com.dxc.flashtrans.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class WithDraw {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long withdrawId;
	private long withdrawAmount;
	private int transactionPin;
	/**
	 * @return the withdrawId
	 */
	public long getWithdrawId() {
		return withdrawId;
	}
	/**
	 * @param withdrawId the withdrawId to set
	 */
	public void setWithdrawId(long withdrawId) {
		this.withdrawId = withdrawId;
	}
	/**
	 * @return the withdrawAmount
	 */
	public long getWithdrawAmount() {
		return withdrawAmount;
	}
	/**
	 * @param withdrawAmount the withdrawAmount to set
	 */
	public void setWithdrawAmount(long withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
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
		return "WithDraw [withdrawId=" + withdrawId + ", withdrawAmount=" + withdrawAmount + ", transactionPin="
				+ transactionPin + "]";
	}
	

}

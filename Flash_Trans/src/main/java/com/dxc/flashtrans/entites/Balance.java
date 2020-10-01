package com.dxc.flashtrans.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Balance {
	
	@Id
	private long balanceId;
	private long balance;
	/**
	 * @return the balanceId
	 */
	public long getBalanceId() {
		return balanceId;
	}
	/**
	 * @param balanceId the balanceId to set
	 */
	public void setBalanceId(long balanceId) {
		this.balanceId = balanceId;
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
		return "Balance [balanceId=" + balanceId + ", balance=" + balance + "]";
	}
	

}

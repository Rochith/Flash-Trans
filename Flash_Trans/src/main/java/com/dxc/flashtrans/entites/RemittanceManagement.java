/**
 * 
 */
package com.dxc.flashtrans.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Flash Trans
 *
 */
@Component
@Entity
public class RemittanceManagement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rmId;
	private String rmName;
	private String email;
	private String cardName;
	private long cardNo;
	private String expDate;
	private int cvv;
	/**
	 * @return the rmId
	 */
	public long getRmId() {
		return rmId;
	}
	/**
	 * @param rmId the rmId to set
	 */
	public void setRmId(long rmId) {
		this.rmId = rmId;
	}
	/**
	 * @return the rmName
	 */
	public String getRmName() {
		return rmName;
	}
	/**
	 * @param rmName the rmName to set
	 */
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the cardName
	 */
	public String getCardName() {
		return cardName;
	}
	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	/**
	 * @return the cardNo
	 */
	public long getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "RemittanceManagement [rmId=" + rmId + ", rmName=" + rmName + ", email=" + email + ", cardName="
				+ cardName + ", cardNo=" + cardNo + ", expDate=" + expDate + ", cvv=" + cvv + "]";
	}
	

}

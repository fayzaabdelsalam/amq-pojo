package com.egabifsi.amq.pojo;

import java.io.Serializable;

public class SendRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4968353501183009767L;
	private String accountNumber;
	private String password;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

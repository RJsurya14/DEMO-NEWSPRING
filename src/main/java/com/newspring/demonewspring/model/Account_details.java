package com.newspring.demonewspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Account_details {

    @Id
	private int accno;
	private String accname;
	private float balance;
	
	public Account_details() {
		super();
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accname=" + accname + ", balance=" + balance + "]";
	}
	
}
    


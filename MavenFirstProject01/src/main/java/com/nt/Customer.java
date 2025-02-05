package com.nt;

public class Customer {

	private String name;
	private String contract;
	private String addr;

	public void setName(String n) {
		this.name = n; //this. is represect a  that name 
	}

	public String getName() {
		return name;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}

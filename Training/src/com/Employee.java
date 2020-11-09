package com;

public class Employee {

	private int EmpNo;
	private String EmpName;
	private Address[] address;
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		this.EmpNo = empNo;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		this.EmpName = empName;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}

	
}

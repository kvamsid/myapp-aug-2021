package com.ofss;

public class Customer {
    String customerName;
    String customerLocation;
    Address add1;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String customerLocation, Address add1) {
		super();
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.add1 = add1;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	public Address getAdd1() {
		return add1;
	}
	public void setAdd1(Address add1) {
		this.add1 = add1;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerLocation=" + customerLocation + ", add1=" + add1
				+ "]";
	}
    
}

package com.ofss;

public class TestCustomer {
	public static void main(String args[]) {
		Address add1= new Address(1,"James Street","Hyderabad");
		Customer cust1= new Customer("vamsi","Hyderabad",add1);
		System.out.println(cust1);
	}
}

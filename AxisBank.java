package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		
		System.out.println("deposit is 50000 in axis bank");
		
	}
	
	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
		
	}
	
}

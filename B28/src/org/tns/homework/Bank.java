package org.tns.homework;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount divyabalaSavings = new SavingsAccount();
		divyabalaSavings.withdraw(300);
		divyabalaSavings.deposit(900);
		divyabalaSavings.addInterest();
		System.out.println(divyabalaSavings.getBalance());
		

	}

}

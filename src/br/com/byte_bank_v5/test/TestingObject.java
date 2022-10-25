package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.Account;
import br.com.byte_bank_v5.models.CheckingAccount;
import br.com.byte_bank_v5.models.SavingsAccount;

public class TestingObject {

	public static void main(String[] args) {

		// Sobrecarga
		System.out.println("x");
		System.out.println(1);
		System.out.println(true);
		
		Object checkingAccount = new CheckingAccount(123, 321);
		Object savingsAccount = new SavingsAccount(123, 321);
		
		System.out.println(checkingAccount);
		
		println(checkingAccount);
	}
	
	static void println() {}

	static void println(int value) {}
	
	static void println(boolean value) {}
	
	static void println(String value) {}
	
	static void println(Object account) {}
}

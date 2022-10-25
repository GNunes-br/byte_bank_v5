package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.*;
import br.com.byte_bank_v5.special.SpecialAccount;


public class TestingAccounts {
	
	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount(111, 111);
		checkingAccount.deposit(100.00);
		
		SavingsAccount savingsAccount = new SavingsAccount(222, 222);
		savingsAccount.deposit(200.00);
		
		try {
			checkingAccount.transfer(10.00, savingsAccount);			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Saldo conta corrente = " + checkingAccount.getBalance());
		System.out.println("Saldo conta poupanca = " + savingsAccount.getBalance());
		
	}
}
 
package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.*;

public class TestingWithdraw {

	public static void main(String[] args) {
		
		Account checkingAccount = new CheckingAccount(123, 321);
		
		checkingAccount.deposit(200.0);
		
		try {
			checkingAccount.withdraw(210.0);			
		} catch (InsufficientBalanceException exception) {
			System.err.println(exception.getMessage());
		}
		
		System.out.println(checkingAccount.getBalance());
	}
}

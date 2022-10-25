package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.*;

public class TestingReferenceArray {

	public static void main(String[] args) {
		
		Account[] accounts = new Account[10];
		
		System.out.println(accounts.length);
		
		for(int index = 0; index < accounts.length; index++) {
			
			int number = index + 321;
			
			boolean isItEvenNumber = index % 2 == 0;
			
			if(isItEvenNumber) {
				accounts[index] = new SavingsAccount(1, number);
			} else {				
				accounts[index] = new CheckingAccount(2, number);
			}
		}
		
		for(int index = 0; index < accounts.length; index++) {
			System.out.println("Agencia: " + accounts[index].getAgency());
			System.out.println("Numero: " + accounts[index].getNumber());
			System.out.println("----------");
		}
	}
}

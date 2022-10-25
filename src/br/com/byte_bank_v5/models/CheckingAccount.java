package br.com.byte_bank_v5.models;

public class CheckingAccount extends Account implements Taxable {
	
	public CheckingAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public void withdraw(double value) throws InsufficientBalanceException {
		double withdrawValue = value + 0.2;
		super.withdraw(withdrawValue);
	}
	
	@Override
	public void deposit(double value) {
		super.balance += value;
	}

	@Override
	public double getTaxValue() {
		return super.balance * 0.01;
	}
}

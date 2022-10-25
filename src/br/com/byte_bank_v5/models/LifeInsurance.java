package br.com.byte_bank_v5.models;

public class LifeInsurance implements Taxable {

	@Override
	public double getTaxValue() {
		return 42;
	}

}

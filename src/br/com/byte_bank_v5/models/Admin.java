package br.com.byte_bank_v5.models;

public class Admin extends Employee implements Auth {
	
	AuthUtil authUtil;
	
	public Admin() {
		authUtil = new AuthUtil();
	}

	@Override
	public double getBonus() {
		return 50;
	}
	
	@Override
	public void setPassword(int password) {
		this.authUtil.setPassword(password);
	}
	
	@Override
	public boolean auth(int password) {
		return this.authUtil.auth(password);
	}

}

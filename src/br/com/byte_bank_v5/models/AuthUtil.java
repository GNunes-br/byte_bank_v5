package br.com.byte_bank_v5.models;

public class AuthUtil {
	
	private int password;
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean auth(int password) {
		if(this.password == password) {
			return true;
		}
		
		return false;
	}
}

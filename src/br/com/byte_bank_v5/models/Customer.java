package br.com.byte_bank_v5.models;

/**
 * Classe que representa um cliente no ByteBank
 * 
 * @author Guilherme Nunes
 * @version 0.1
 * 
 * 
 */
public class Customer implements Auth {
	
	AuthUtil authUtil;
	
	public Customer() {
		authUtil = new AuthUtil();
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

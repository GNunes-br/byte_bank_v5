package br.com.byte_bank_v5.models;

public class InternalSystem {
	
	private int password = 2222;
	
	public void auth(Auth employee) {
		boolean auth = employee.auth(this.password);
		
		if(auth) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}
}

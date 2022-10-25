package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.*;

public class TestingManager {
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.setName("Guilherme Nunes");
		manager.setDocument("222.222.222-22");
		manager.setRemuneration(5000.00);
		manager.setPassword(2222);
		
		System.out.println(manager.getName());
		System.out.println(manager.getDocument());
		System.out.println(manager.getRemuneration());
		
		boolean auth = manager.auth(2222);
		
		System.out.println(auth);
		
		System.out.println(manager.getBonus());
	}
}

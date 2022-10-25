package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.*;

public class TestingConnection {

	public static void main(String[] args) {
		
		try (Connection connection = new Connection()) {
			
			connection.gettingData();
		} catch (IllegalStateException ex) {
			System.err.println("Erro ao estabelecer conexão!");
		}
	}
}

package br.com.byte_bank_v5.models;

// Unchecked
// public class InsufficientBalanceException extends RuntimeException {}

// Checked
public class InsufficientBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {
		super("Saldo insuficiente");
	}
	
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

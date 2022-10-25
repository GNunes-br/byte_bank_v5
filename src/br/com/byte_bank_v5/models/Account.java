package br.com.byte_bank_v5.models;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Guilherme Nunes
 *
 */
public abstract class Account {
	protected double balance;
	private int agency;
	private int number;
	Customer customer;
	
	/**
	 * Construtor para inicializar o objeto conta a partir da agencia e número
	 * 
	 * @param agency
	 * @param number
	 */
	
	public Account (int agency, int number) {
		this.setAgency(agency);
		this.setNumber(number);
	}
		
	public abstract void deposit(double value);
	
	/**
	 * Valor precisa ser maior que o saldo
	 * 
	 * @param value
	 * @throws InsufficientBalanceException
	 */
	public void withdraw(double value) throws InsufficientBalanceException {
		
		if(this.balance < value) {			
			throw new InsufficientBalanceException();
		}
		
		this.balance -= value;
	}
	
	public void transfer(double value, Account receiver) throws InsufficientBalanceException {
		this.withdraw(value);
		receiver.deposit(value);
	}
	
	public double getBalance( ) {
		return this.balance;
	}
	
	public int getAgency( ) {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if(agency <= 0) {
			System.out.println("Agencia invalida");
			return;
		}
		this.agency = agency;
	}
	
	public int getNumber( ) {
		return this.number;
	}
	
	public void setNumber(int number) {
		if(number <= 0) {
			System.out.println("Numero invalido");
			return;
		}
		this.number = number;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
}

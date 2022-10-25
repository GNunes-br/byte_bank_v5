package br.com.byte_bank_v5.models;

public abstract interface Auth {
	
	public abstract void setPassword(int password);
		
	public abstract boolean auth(int password);
}

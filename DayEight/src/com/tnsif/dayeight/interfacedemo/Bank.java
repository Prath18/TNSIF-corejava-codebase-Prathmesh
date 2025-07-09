package com.tnsif.dayeight.interfacedemo;

public interface Bank {
	
	final static float MINBAL=5000;
	final static float Deposit_Limit=25000;
	
	public default void deposit(float amount) {
	}
	public default void withdraw(float amount) {
	}
	
	
	
}

package com.entities;

public class Conta {
	private int number;
	private String holder;
	private double balance;
	
	public Conta() {
		
	}
	public Conta(int number, String holder, double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	public Conta(int number, String holder) {
		this.holder = holder;
		this.number = number;
		
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5.00);
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void info() {
		System.out.println("Updated account data:\nAccount "+number+", Holder: "+holder+", Balance: $ "+ String.format("%.2f", balance) );
	}
}
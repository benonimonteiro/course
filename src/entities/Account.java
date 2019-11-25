package entities;

import exceptions.WithdrawException;

public class Account {
	
	public static final double TAX = 5.00;

	private Integer number;
	private String holder;
	protected Double balance;
	private Double withdrawLimit;
	
	public Account() {
	};
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(Integer number, String holder, Double balance) {
		this(number, holder);
		this.balance = balance;
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this(number, holder, balance);
		this.withdrawLimit = withdrawLimit;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder ) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (withdrawLimit != 0 && amount > withdrawLimit) {
			throw new WithdrawException("Amount exceeds withdraw limit");
		}
		
		if (amount > balance) {
			throw new WithdrawException("Not enough balance");
		}		
		
		balance -= amount + TAX;
	}
	
	public String toString() {
		return "Account: "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
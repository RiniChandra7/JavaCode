package bank;

public class Account {
	protected int accountNumber;
	protected double balance;
	private double interestRate;
	
	public Account(int num, double bal) {
		accountNumber = num;
		balance = bal;
		interestRate = 0.0;
	}
	
	public Account(int num, double bal, double r) {
		accountNumber = num;
		balance = bal;
		interestRate = r;
	}
	
	public void debit(double amt) {
		balance = balance - amt;
		//return balance;
	}
	
	public void credit(double amt) {
		balance = balance + amt;
		//balance += calculateInterest();
		//return balance;
	}
	
	public void calculateInterest() {
		if (interestRate != 0.0) {
			System.out.println("You have earned an interest worth "+ (balance * (interestRate / 100.0))+" on your Savings account "+this.accountNumber);
			this.credit(balance * (interestRate / 100.0));
		} else {
			System.out.println("No interest applicable on your Current account "+this.accountNumber);
		}
	}
	
	public double getBalance() {
		return balance;
	}
}

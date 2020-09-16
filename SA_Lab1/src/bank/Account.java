package bank;

public class Account {
	protected int accountNumber;
	protected double balance;
	//double interestRate;
	
	public Account(int num, double bal) {
		accountNumber = num;
		balance = bal;
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
		this.credit(0.0);
	}
	
	public double getBalance() {
		return balance;
	}
}

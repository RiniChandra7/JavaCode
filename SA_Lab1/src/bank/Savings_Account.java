package bank;

public class Savings_Account extends Account {
	double interest;
	
	public Savings_Account(int acc, double bal, double r) {
		super(acc, bal);
		interest = r;
	}
	
	public void calculateInterest() {
		System.out.println("You have earned an interest worth "+ (balance * (interest / 100.0))+" on your Savings account.");
		this.credit(balance * (interest / 100.0));
	}
}

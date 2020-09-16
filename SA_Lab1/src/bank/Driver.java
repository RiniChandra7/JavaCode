package bank;

public class Driver {
	public static void main(String args[]) {
		Savings_Account sa = new Savings_Account(123, 1000, 5);
		Current_Account ca = new Current_Account(124, 2000);
		
		sa.credit(100);
		sa.calculateInterest();
		System.out.println("Balance for account "+ sa.accountNumber +" is "+sa.getBalance());
		sa.debit(5);
		System.out.println("Balance for account "+ sa.accountNumber +" is "+sa.getBalance());
		
		ca.credit(100);
		ca.calculateInterest();
		System.out.println("Balance for account "+ ca.accountNumber +" is "+ca.getBalance());
	}
}

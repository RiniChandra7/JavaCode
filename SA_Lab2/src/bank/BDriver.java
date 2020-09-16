package bank;

import java.util.*;

public class BDriver {
	public static void main(String args[]) {
		Vector<Account> acc = new Vector<Account>(3);
		
		Account sa = new Account(123, 1000, 5);
		acc.add(sa);
		
		Account ca = new Account(124, 2000);
		acc.add(ca);
		
		Account a = new Account(122, 100, 10);
		acc.add(a);
		
		for (int i = 0; i < 3; i++) {
			Account ele = acc.elementAt(i);
			ele.credit(100);
			ele.calculateInterest();
			System.out.println("Balance for account "+ ele.accountNumber +" is "+ele.getBalance());
		}
		/*sa.credit(100);
		sa.calculateInterest();
		System.out.println("Balance for account "+ sa.accountNumber +" is "+sa.getBalance());
		sa.debit(5);
		System.out.println("Balance for account "+ sa.accountNumber +" is "+sa.getBalance());
		
		ca.credit(100);
		ca.calculateInterest();
		System.out.println("Balance for account "+ ca.accountNumber +" is "+ca.getBalance());*/
	}
}

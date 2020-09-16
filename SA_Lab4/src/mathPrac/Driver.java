package mathPrac;

import java.util.*;

public class Driver {
	public static int getRandomNumber(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Max must be greater than min.");
		}
		
		return (int)(Math.random() * ((max - min) + 1) + min);
	}
	
	public static void main(String args[]) {
		int p;
		Scanner sc = new Scanner(System.in);
		
		
		
		int min = -10;
		int max = 10;
		int right = 0;
		int wrong = 0;
		
		int newSet = 1;
		
		do {
			int i = 0;
			System.out.println("Enter the number of problems you wish to practice - ");
			p = sc.nextInt();
			while (i < p) {
				int a = getRandomNumber(min, max);
				int b = getRandomNumber(min, max);
				int op = getRandomNumber(1, 2);
				int ans;
				
				if (op == 1) {
					Addition add = new Addition(a, b);
					System.out.println("Solve "+ add.getterOp1() +"+"+ add.getterOp2() +" = ");
					ans = sc.nextInt();
					if (ans == add.getAnswer()) {
						right++;
					} else {
						wrong++;
					}
				} else {
					Subtraction sub = new Subtraction(a, b);
					System.out.println("Solve "+ sub.getterOp1() +"-"+ sub.getterOp2() +" = ");
					ans = sc.nextInt();
					if (ans == sub.getAnswer()) {
						right++;
					} else {
						wrong++;
					}
				}
				
				i++;
			}
			newSet = 0;
			System.out.println("Do you wish to get a new set of problems?\n1 - Yes\n0 - No");
			newSet = sc.nextInt();
			if (newSet != 1) {
				System.out.println("Practice terminated.");
			}
		} while (newSet == 1);
		
		System.out.println("Number of right answers = "+right);
		System.out.println("Number of wrong answers = "+wrong);
		
		sc.close();
	}
}

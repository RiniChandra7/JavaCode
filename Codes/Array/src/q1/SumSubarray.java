package q1;

import java.util.*;

public class SumSubarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] res = new int[T][2];
		for (int tst = 1; tst <= T; tst++) {
			int arSize = sc.nextInt();
			int sum = sc.nextInt();
			
			int[] num = new int[arSize];
			for (int i = 0; i < arSize; i++) {
				num[i] = sc.nextInt();
			}
			
			int s = 0;
			int start = 0;
			int end = 0;
			int ind = 0;
			while (ind < arSize) {
				if (s == sum) {
					res[tst][0] = start;
					res[tst][1] = end;
				} else if (s > sum) {
					start += 1;
					ind = start;
					end = 0;
					s = 0;
				}
				
				s += num[ind];
				ind++;
				end++;
			}
		}
		
		for (int i = 0; i <= T; i++) {
			System.out.println(res[i][0]+" "+res[i][1]);
		}
		
		sc.close();
	}
}

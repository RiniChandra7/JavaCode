package easy;

import java.util.*;

public class Nukes {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long a;
		int n;
		int k;
		a = sc.nextLong();
		n = sc.nextInt();
		k = sc.nextInt();
		
		int[] count = new int[k];
		Arrays.fill(count, 0);
		
		for (int i = 0; i < k; i++) {
			if ((a % k) <= n) {
				count[i] += a % k;
				a = a / k;
			} else {
				count[i] = 0;
				a += (a % k) - n;
			}
		}
		
		sc.close();
	}
}

package easy;

import java.util.*;

public class Carvans {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while (t != 0) {
			int n = sc.nextInt();
			int[] cars = new int[n];
			for (int i = 0; i < n; i++) {
				cars[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n - 1; i++) {
				if (cars[i] > cars[i + 1]) {
					count++;
				} else {
					cars[i + 1] = cars[i];
				}
			}
			System.out.println(count);
			t--;
		}
		
		sc.close();
	}
}

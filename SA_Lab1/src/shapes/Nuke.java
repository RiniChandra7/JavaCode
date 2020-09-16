package shapes;

import java.util.*;

public class Nuke {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long a;
		int n;
		int k;
		a = sc.nextLong();
		n = sc.nextInt();
		k = sc.nextInt();
		
		//System.out.println("abs");
		int[] count = new int[k];
		Arrays.fill(count, 0);		
		//int i = 0;
		
		/*while (a != 0 && i < k) {
			if (count[i] < n) {
				count[i] += (n - count[i]);
				a -= (n - count[i]);
				i++;
			} else if (count[i] > n) {
				a += (count[i] - n);
				count[i] = 0;
				i--;
			}
		}*/
		
		while (a != 0) {
			for (int i = 0; i < k; i++) {
				if (count[i] < n) {
					count[i]++;
					a--;
					break;
				} else if (count[i] >= n) {
					count[i] = 0;
				}
			}
		}
		
		for (int j = 0; j < k; j++) {
			System.out.print(count[j]+" ");
		}
		System.out.println();
		
		sc.close();
	}

}

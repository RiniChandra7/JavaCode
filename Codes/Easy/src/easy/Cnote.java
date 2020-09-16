package easy;

import java.util.*;

public class Cnote {
	public static void insertionSort(int pg[], int cost[]) {
		int n = pg.length;
		for (int i = 1; i < n; i++) {
			int key = pg[i];
			int key1 = cost[i];
			int j = i - 1;
			while (j > -1 && key < pg[j]) {
				pg[j + 1] = pg[j];
				cost[j + 1] = cost[j];
				j--;
			}
			pg[j + 1] = key;
			cost[j + 1] = key1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			while (t > 0) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int k = sc.nextInt();
				int n = sc.nextInt();
				
				if (x >= 1 && x <= 1000 && k >= 1 && k <= 1000 && y >= 1 && y <= 1000 && n >= 1 && n <= 100000 && x >= y) {
					int p[] = new int[n];
					int c[] = new int[n];
					
					for (int i = 0; i < n; i++) {
						p[i] = sc.nextInt();
						c[i] = sc.nextInt();
					}
					
					int diff = x - y;
					//insertionSort(c, p);
					int ind = -1;
					for (int i = 0; i < n; i++) {
						/*if (c[i] > k) {
							break;
						}*/
						if (p[i] >= diff && c[i] <= k) {
							ind = i;
							break;
						}
					}
					
					if (ind == -1) {
						System.out.println("UnluckyChef");
					}
					else {
						System.out.println("LuckyChef");
					}
				}
				
				t--;
			}
			
			sc.close();
		}
		catch (Exception e) {}
	}

}

package codeNation;

import java.util.*;

public class Tree {
	public static boolean isBful(int n, int x) {
		int sum = 0;
		int dup = n;
		
		while (dup > 0) {
			int dig = (dup % 10);
			sum += dig * dig;
			dup = dup / 10;
		}
		
		if (sum <= x) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void bful(int x, int f[]) {
		int i = 1;
		int ind = 0;
		while (ind < x) {
			if (isBful(i, x)) {
				f[ind] = i;
				ind++;
				//x--;
			}
			i++;
			//x--;
		}
	}
	
	public static void main(String args[]) {
		//try {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			
			int f[] = new int[x];
			bful(x, f);
			for (int i = 0; i < x; i++) {
				System.out.print(f[i]+" ");
			}
			System.out.println();
			
			int edges[][] = new int[n - 1][2];
			
			for (int i = 0; i < (n - 1); i++) {
				edges[i][0] = sc.nextInt() - 1;
				edges[i][1] = sc.nextInt() - 1;
			}
			
			int g[][] = new int[n][n];
			
			for (int i = 0; i < (n - 1); i++) {
				g[edges[i][0]][edges[i][1]] = 1;
			}
			
			/*for (int i = 0; i <= (n - 1); i++) {
				for (int j = 0; j <= (n - 1); j++) {
					System.out.print(g[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();*/
			
			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (g[i][j] > g[i][k] + g[k][j]) {
							g[i][j] = g[i][k] + g[k][j];
						}
					}
				}
			}
			
			/*for (int i = 0; i <= (n - 1); i++) {
				for (int j = 0; j <= (n - 1); j++) {
					System.out.print(g[i][j] + " ");
				}
				System.out.println();
			}*/
			
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt() - 1;
			}
			
			while (m > 0) {
				int q = sc.nextInt();
				if (q == 1) {
					int ind = sc.nextInt();
					ind = ind - 1;
					int y = sc.nextInt() - 1;
					a[ind] = y;
				} else if (q == 2) {
					int ind = sc.nextInt() - 1;
					int sum = f[a[ind]];
					for (int i = 0; i < n; i++) {
						if (g[ind][i] > 0) {
							sum += f[a[i]];
						}
					}
					System.out.println(sum);
				}
				m--;
			}
		}
		//catch (Exception e) {}
	
}

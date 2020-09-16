package easy;

import java.util.*;

public class Cleanup {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			if (t <= 50) {
				while (t != 0) {
					int n = sc.nextInt();
					if (n >= 0 && n <= 1000) {
						int m = sc.nextInt();
						if (m <= n && m >= 0) {
							int all[] = new int[n];
							for (int i = 0; i < n; i++) {
								all[i] = i + 1;
							}
							
							int done[] = new int[m];
							for (int i = 0; i < m; ) {
								int x = sc.nextInt();
								if (x >= 1 && x <= n) {
									done[i] = x;
									all[x - 1] = 0;
									i++;
								}
							}
							
							int undone[] = new int[n - m];
							int k = 0;
							for (int i = 0; i < n; i++) {
								if (all[i] != 0) {
									undone[k] = all[i];
									k++;
								}
							}
							Arrays.sort(undone);
							int c1[] = new int[(n - m) / 2 + 1];
							int c2[] = new int[(n - m) / 2 + 1];
							int k1 = 0;
							int k2 = 0;
							for (int i = 0; i < n - m; i++) {
								if (i % 2 == 0) {
									c1[k1] = undone[i];
									k1++;
								} else {
									c2[k2] = undone[i];
									k2++;
								}
							}
							for (int i = 0; i < k1; i++) {
								System.out.print(c1[i] + " ");
							}
							System.out.println("");
							for (int i = 0; i < k2; i++) {
								System.out.print(c2[i] + " ");
							}
						}
					}
					t--;
				}
			}
			sc.close();
		}
		catch (Exception e) {}
	}

}

package easy;

import java.util.*;

public class Cleanup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			if (t <= 50) {
				while (t != 0) {
					int n = sc.nextInt();
					if (n >= 0 && n <= 1000) {
						int m = sc.nextInt();
						if (m <= n && m >= 0) {
							int done[] = new int[m];
							for (int i = 0; i < m; ) {
								int x = sc.nextInt();
								if (x >= 1 && x <= n) {
									done[i] = x;
									i++;
								}
							}
							Arrays.sort(done);
							System.out.println("Done tasks are");
							for (int i = 0; i < m; i++) {
								System.out.print(done[i] + " ");
							}
							System.out.println();
							int c1[] = new int[((n - m) / 2) + 1];
							int c2[] = new int[((n - m) / 2) + 1];
							int k1 = 0;
							int k2 = 0;
							String s1 = "";
							String s2 = "";
							
							int j = 0;
							for (int i = 1; i <= n; i++) {
								/*if (i != done[j] || j >= n) {
									System.out.println(i+" != "+done[j]);
									if (i % 2 == 1) {
										//s1 += (i + ""); 
										c1[k1] = i;
										k1++;
									} else {
										//s2 += (i + "");
										c2[k2] = i;
										k2++;
									}
								} else {
									System.out.println(i+" = "+done[j]);
									if (j < m)
										j++;
								}*/
								int f = Arrays.binarySearch(done, i);
								if (!(f >= 0 && f < m)) {
									System.out.println(i+" != ");
									if (i % 2 == 1) {
										//s1 += (i + ""); 
										c1[k1] = i;
										k1++;
									} else {
										//s2 += (i + "");
										c2[k2] = i;
										k2++;
									}
								} else {
									//j++;
								}
							}
							//System.out.println(s1);
							System.out.println("C1");
							for (int i = 0; i < k1; i++) {
								System.out.print(c1[i] + " ");
							}
							System.out.println("");
							System.out.println("C2");
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

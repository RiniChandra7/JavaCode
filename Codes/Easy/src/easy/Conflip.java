package easy;

import java.util.*;

public class Conflip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			
			while (t <= 10 && t >= 1) {
				int g = sc.nextInt();
				
				while (g >= 1 && g <= 20000) {
					int i = sc.nextInt();
					int n = sc.nextInt();
					int q = sc.nextInt();
					
					if ((i == 1 || i == 2) && (q == 1 || q == 2)) {
						int head = 0;
						int tail = 0;
						
						if (n % 2 == 0) {
							head = n / 2;
							tail = n / 2;
						} else {
							if (i == 1) {
								head = n / 2;
								tail = n / 2 + 1;
							} else {
								head = n / 2 + 1;
								tail = n / 2;
							}
						}
						
						if (q == 1) {
							System.out.println(head);
						} else {
							System.out.println(tail);
						}
					}
					
					g--;
				}
				t--;
			}
			sc.close();
		}
		catch (Exception e) {}
	}

}

package easy;

import java.util.*;

public class Cielab {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b < a && 1 <= a && a <= 10000 && 1 <= b && b <= 10000) {
				StringBuilder str = new StringBuilder((a - b) + "");
				int dig = (a - b) % 10;
				if (dig == 9) {
					dig -= 1;
				} else {
					dig += 1;
				}
				str.setCharAt(str.length() - 1, (char) (dig + '0'));
				System.out.println(str.toString());
			}
			
			sc.close();
		}
		catch (Exception e) {}
	}
}

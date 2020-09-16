package easy;

import java.util.*;

public class Fctrl {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int t = sc.nextInt();
			
			while (t > 0) {
				int div = 5;
				int num = sc.nextInt();
				int z = 0;
				//int dup = num;
				
				while ((num / div) > 0) {
					z += (num / div);
					//num = num / div;
					div *= 5;
				}
				
				System.out.println(z);
			}
			
			sc.close();
		}
		catch (Exception e) {}
	}

}

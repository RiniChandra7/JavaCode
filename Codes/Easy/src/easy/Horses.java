package easy;

import java.util.*;

public class Horses {
	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
	}
	
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			
			while (t > 0) {
				int n = sc.nextInt();
				if (n > 1 && n <= 5000) {
					int s[] = new int[n];
					for (int i = 0; i < n; i++) {
						s[i] = sc.nextInt();
					}
					
					insertionSort(s);  
					
					int diff[] = new int[n - 1];
					for (int i = 0; i < n - 1; i++) {
						diff[i] = s[i + 1] - s[i];
					}
					insertionSort(diff);
					
					System.out.println(diff[0]);
				}
				t--;
			}
			
			sc.close();
		}
		catch(Exception e) {}
	}
}

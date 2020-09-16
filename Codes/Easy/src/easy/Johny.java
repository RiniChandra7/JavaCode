package easy;

import java.util.*;

public class Johny {
	public static void insertionSort(int songs[]) {
		int n = songs.length;
		for (int i = 1; i < n; i++) {
			int key = songs[i];
			int j = i - 1;
			while (j > -1 && key < songs[j]) {
				songs[j + 1] = songs[j];
				//pos[j + 1] = pos[j];
				j--;
			}
			songs[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			while (t != 0) {
				int n = sc.nextInt();
				if (n >= 1 && n <= 100) {
					int s[] = new int[n];
					for (int i = 0; i < n; i++) {
						s[i] = sc.nextInt();
					}
					int k = sc.nextInt();
					int fav = s[0];
					if (k >= 1 && k <= n) {
						fav = s[k - 1];
					}
					insertionSort(s);
					int pos = Arrays.binarySearch(s, fav);
					System.out.println(pos + 1);
				}
				t--;
			}
			
			sc.close();
		}
		catch (Exception e) {}
	}

}

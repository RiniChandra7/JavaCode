package q3_pkg1;

import q3_pkg.Sum;

public class SumCaller {

	public static void main(String args[]) {
		Sum s = new Sum(3, 4);
		System.out.println(s.calcSum());
	}
}

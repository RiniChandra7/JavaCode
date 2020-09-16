package q3;

public class Driver {
	public static void main(String args[]) {
		Frog f = new Frog ("Frog", "Trrr");
		Amphibian a = f;
		
		a.introduce();
		a.speak();
		f.croak();
		
	}
}

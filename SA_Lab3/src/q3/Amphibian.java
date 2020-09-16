package q3;

public class Amphibian {
	String name;
	String sound;
	
	public Amphibian(String n, String s) {
		name = n;
		sound = s;
	}
	
	public void introduce() {
		System.out.println("I am a "+name+".");
	}
	
	public void speak() {
		for (int i = 1; i <= 3; i++) {
			System.out.print(sound+" ");
		}
		System.out.println(".");
	}
}

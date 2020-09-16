package shapes;

abstract class Shape {
	String name;
	
	public Shape(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
}

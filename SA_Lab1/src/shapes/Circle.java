package shapes;

public class Circle extends Shape implements Area {
	double radius;
	
	public Circle(double r, String n) {
		super(n);
		radius = r;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}
}

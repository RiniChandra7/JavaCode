package shapes;

public class Cylinder extends Circle implements Volume {
	double height;
	
	public Cylinder(double h, double r, String n) {
		super(r, n);
		height = h;
	}

	public double getVolume() {
		return ((1 / 3.0) * super.getArea() * height);
	}
}

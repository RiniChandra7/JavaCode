package shapes;

public class Sphere extends Circle implements Volume {
	public Sphere(double r, String n) {
		super(r, n);
	}

	public double getVolume() {
		return ((4 / 3.0) * Math.PI * Math.pow(radius, 3.0));
	}
}

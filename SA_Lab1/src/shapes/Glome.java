package shapes;

public class Glome extends Sphere implements Volume {
	public Glome(double r, String n) {
		super(r, n);
	}

	public double getVolume() {
		return ((1 / 2.0) * Math.PI * Math.PI * Math.pow(radius, 4.0));
	}
}

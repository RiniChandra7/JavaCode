package shapes;

public class Cube extends Square implements Volume {
	public Cube(double s, String n) {
		super(s, n);
	}

	public double getVolume() {
		return (side * side * side);
	}
}

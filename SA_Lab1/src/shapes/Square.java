package shapes;

public class Square extends Shape implements Area {
	double side;
	
	public Square(double s, String n) {
		super(n);
		side = s;
	}

	public double getArea() {
		return (side * side);
	}
}

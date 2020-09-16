package bike;

public class MountainBike extends Bicycle {
	int seatHeight;

	public MountainBike(int g, float s, int sh) {
		super(g, s);
		seatHeight = sh;
		// TODO Auto-generated constructor stub
	}

	public void updateSeatHeight(int s) {
		seatHeight = s;
	}
}

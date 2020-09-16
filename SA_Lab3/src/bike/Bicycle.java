package bike;

public class Bicycle {
	int gear;
	float speed;
	
	public Bicycle(int g, float s) {
		gear = g;
		speed = s;
	}
	
	public void incrementSpeed(float inc) {
		speed += inc;
	}
	
	public void decrementSpeed(float dec) {
		speed -= dec;
	}
}

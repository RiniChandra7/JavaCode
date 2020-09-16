package bike;

public class Driver {
	public static void main(String args[]) {
		Bicycle b = new Bicycle(3, 10);
		MountainBike mb = new MountainBike(4, 7, 10);
		
		System.out.println("For the bicycle-\nCurrent Speed = "+b.speed+", Gear = "+b.gear);
		b.decrementSpeed(2);
		System.out.println("Decreased speed by 2 = "+b.speed);
		b.incrementSpeed(3);
		System.out.println("Increased speed by 3 = "+b.speed);
		System.out.println("For the mountain bike-\nCurrent Speed = "+mb.speed+",Gear = "+mb.gear+",Seat height = "+mb.seatHeight);
		mb.updateSeatHeight(7);
		System.out.println("Updated seat height = "+mb.seatHeight);
	}
}
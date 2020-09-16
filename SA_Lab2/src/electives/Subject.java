package electives;

public class Subject {
	String name;
	int enrolled;
	int capacity;
	
	public Subject(String name, int capacity) {
		this.name = name;
		this.enrolled = 0;
		this.capacity = capacity;
	}
	
	public Subject(String n) {
		this.name = n;
		this.enrolled = 0;
		this.capacity = 10;
	}
	
	public void addEnrolled() {
		if (enrolled < capacity) {
			enrolled += 1;
		} else {
			System.out.println("Maximum possible students have been enrolled already.");
		}
	}
}

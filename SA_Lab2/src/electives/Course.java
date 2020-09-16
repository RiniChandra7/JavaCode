package electives;

import java.util.List;

public class Course {
	List<Subject> options;
	
	public Course(List<Subject> opt) {
		options = opt;
	}
	
	public void addSubject(Subject sub) {
		options.add(sub);
	}
}

package oopIntroHomework;

public class Course {
	
	public Course(int id, String courseName, String instructorName, int completionRate, String courseImage) {
		this.courseName = courseName;
		this.id = id;
		this.courseImage = courseImage;
		this.completionRate = completionRate;
	}
	
	int id;
	String courseName;
	String instructorName;
	int completionRate;
	String courseImage;

}

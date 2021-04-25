package oopIntroHomework;

public class CourseManager {
	public void changeCourseName(Course course, String newCourseName) {
		course.courseName = newCourseName;
		System.out.println("Yeni Kurs Adý : " + newCourseName);
	}
	
	public void changeCompletionRate(Course course, int newCompletionRate) {
		course.completionRate = newCompletionRate;
		System.out.println(course.courseName + " - %" + newCompletionRate);
	}
	
	public void changeInstructorName(Course course, String newInstructorName) {
		course.instructorName = newInstructorName;
		System.out.println("Yeni Eðitmen Adý : " + newInstructorName);
	}
}

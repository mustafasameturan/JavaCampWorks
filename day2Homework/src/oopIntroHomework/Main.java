package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# Kursu", "Engin Demiro�", 92, "c#.jpg");
		Course course2 = new Course(2,"Java Kursu", "Engin Demiro�", 32, "java.jpg");
		Course course3 = new Course(1,"Programlaya Giri� Temel Kursu", "Engin Demiro�", 100, "temel.jpg");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println(course.courseName + " - %" + course.completionRate);
			
		}
		
		System.out.println("------------------------------");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.changeCourseName(course3, "Programlamaya Giri� Kursu");
		courseManager.changeCompletionRate(course1, 100);
		courseManager.changeInstructorName(course3, "Mustafa Samet Turan");
		
		System.out.println("------------------------------");
		
		Category category1 = new Category(1, "Programlama");
		
		Category[] categories = {category1};
		
		for (Category category : categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("------------------------------");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.changeCategoryName(category1, "Kodlama");
	}

}

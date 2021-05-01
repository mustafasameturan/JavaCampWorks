package day3Homework;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Yağmur");
		user.setLastName(" Turan");
		user.setUserNumber("03");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Mustafa Samet");
		instructor.setLastName("Turan");
		instructor.setUserNumber("04");
		instructor.setInstructorLesson("Java");
		instructor.setInstructorNumber("01");
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("Buse");
		student.setLastName(" Turan");
		student.setUserNumber("01");
		student.setStudentNumber("115");
		
		Student student2 = new Student();
		student2.setId(4);
		student2.setFirstName("Onur");
		student2.setLastName(" Karabıyık");
		student2.setUserNumber("02");
		student2.setStudentNumber("116");
		
		System.out.println(user.getFirstName() +  user.getLastName());
		
		System.out.println("--------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseInformation(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.getStudent(student);
		studentManager.getStudent(student2);
		
		

	}

}

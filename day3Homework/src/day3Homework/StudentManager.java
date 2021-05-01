package day3Homework;

public class StudentManager extends UserManager{
	public void getStudent(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " listelendi!");
	}
}

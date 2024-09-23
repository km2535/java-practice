package org.java.ch7;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);

		Student studentMike = new Student(1002, "Mike");
		studentMike.addSubject("국어", 55);
		studentMike.addSubject("수학", 100);
		studentMike.addSubject("영어", 95);

		studentLee.showStudentInfo();
		System.out.println("=======");
		studentMike.showStudentInfo();
	}
}

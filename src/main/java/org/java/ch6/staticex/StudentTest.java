package org.java.ch6.staticex;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("이지원");
		System.out.println(Student.getSerialNumber());
		System.out.println(student.studentName + " 학번: " + student.studentId + " 학생증 : " + student.studentCard);

		Student son = new Student();
		son.setStudentName("손수경");
		System.out.println(Student.getSerialNumber());
		System.out.println(son.studentName + " 학번: " + son.studentId + " 학생증 : " + son.studentCard);
	}
}

package org.java.ch6.staticex;

public class Student {
	private static int serialNumber = 1000;
	int studentId;
	int studentCard;
	String studentName;
	int grade;
	String address;

	public Student(){
		serialNumber++;
		studentId = serialNumber;
		studentCard = studentId + 100;
	}

	public String getStudentName(){
		return studentName;
	}

	public void setStudentName(String studentName){
		this.studentName = studentName;
	}

	public static int  getSerialNumber(){
		int i = 10;
		return serialNumber;
	}

	public static void setSerialNumber(int serialNumber){
		Student.serialNumber = serialNumber;
	}

}

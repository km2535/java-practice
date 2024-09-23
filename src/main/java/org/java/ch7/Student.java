package org.java.ch7;

import java.util.ArrayList;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;

	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}

	public void addSubject(String name, int score){
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	public void showStudentInfo(){
		int total = 0;
		for(Subject subject : subjectList){
			total += subject.getScorePoint();
			System.out.println(studentId + " " + studentName + " " + subject.getName() + " " + subject.getScorePoint());
		}
		System.out.println(total);
	}
}

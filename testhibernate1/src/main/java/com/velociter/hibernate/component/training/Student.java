package com.velociter.hibernate.component.training;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Student {
	@Column(name = "STUDENT_ROLL_NO",nullable = false)
	private long studentRollNo;
	@Column(name = "STUDENT_NAME",nullable = false)
	private String studentName;

	public Student() {
	}

	public Student(long studentRollNo, String studentName) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
	}

	public long getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


}

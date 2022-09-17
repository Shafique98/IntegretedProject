package com.velociter.hibernate.component.training;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRAININGCENTER")
public class TrainingCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long courseId;
	@Embedded
	private Courses course = new Courses();
	@Embedded
	private Student student = new Student();
	
	public TrainingCenter() {
	}

	public TrainingCenter(Courses course, Student student) {
		super();
		this.course = course;
		this.student = student;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}

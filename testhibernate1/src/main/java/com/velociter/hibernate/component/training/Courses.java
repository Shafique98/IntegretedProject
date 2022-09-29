package com.velociter.hibernate.component.training;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Courses {
	
	@Column(name = "COURSE_NAME",nullable = false)
	private String courseName;
	
	@Column(name = "COURSE_DURATION",nullable = false)
	private String courseDuration;
	
	@Column(name = "COURSE_FEES",nullable = false)
	private float courseFees;

	public Courses() {
	}

	public Courses(String courseName, String courseDuration, float courseFees) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public float getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(float courseFees) {
		this.courseFees = courseFees;
	}

}

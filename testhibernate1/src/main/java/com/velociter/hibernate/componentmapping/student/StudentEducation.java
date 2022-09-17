package com.velociter.hibernate.componentmapping.student;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentEducation {
	@Column(name = "FIELD_NAME")
	private String field;
	@Column(name = "INSTITUTE_NAME")
	private String institueName;
	@Column(name = "BOARD_UNIVERSITY")
	private String boardOrUniversity;
	@Column(name = "GRADES")
	private String grade;
	
	public StudentEducation() {}

	public StudentEducation(String field, String institueName, String boardOrUniversity, String grade) {
		super();
		this.field = field;
		this.institueName = institueName;
		this.boardOrUniversity = boardOrUniversity;
		this.grade = grade;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getInstitueName() {
		return institueName;
	}

	public void setInstitueName(String institueName) {
		this.institueName = institueName;
	}

	public String getBoardOrUniversity() {
		return boardOrUniversity;
	}

	public void setBoardOrUniversity(String boardOrUniversity) {
		this.boardOrUniversity = boardOrUniversity;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}

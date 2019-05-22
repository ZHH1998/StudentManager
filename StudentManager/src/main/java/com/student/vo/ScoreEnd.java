package com.student.vo;

import java.io.Serializable;

public class ScoreEnd implements Serializable {
	
	private String studentName;
	private String studetnAccount;
	private String courseName;
	private Integer score;
	public ScoreEnd(String studentName, String studetnAccount, String courseName, Integer score) {
		super();
		this.studentName = studentName;
		this.studetnAccount = studetnAccount;
		this.courseName = courseName;
		this.score = score;
	}
	public ScoreEnd() {
		super();
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudetnAccount() {
		return studetnAccount;
	}
	public void setStudetnAccount(String studetnAccount) {
		this.studetnAccount = studetnAccount;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "ScoreEnd [studentName=" + studentName + ", studetnAccount=" + studetnAccount + ", courseName="
				+ courseName + ", score=" + score + "]";
	}
	
	
	
}

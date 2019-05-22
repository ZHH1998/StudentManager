package com.student.po;

import java.io.Serializable;

public class StudentCourse implements Serializable {
	private static final long serialVersionUID = -775265001145189808L;
	private String courseName;	//课程名称
	private String courseRoom;	//上课教室
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseRoom() {
		return courseRoom;
	}
	public void setCourseRoom(String courseRoom) {
		this.courseRoom = courseRoom;
	}
	@Override
	public String toString() {
		return "StudentCourse [courseName=" + courseName + ", courseRoom=" + courseRoom + "]";
	}
	
}

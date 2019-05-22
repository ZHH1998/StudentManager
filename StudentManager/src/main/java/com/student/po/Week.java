package com.student.po;

import java.io.Serializable;
import java.util.Date;

public class Week implements Serializable {
	private static final long serialVersionUID = -6497248491810849059L;
	private long studentId;
	private String address;
	private Date dayTime;
	private String weekDiaryPath;
	private String studentName;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDayTime() {
		return dayTime;
	}
	public void setDayTime(Date dayTime) {
		this.dayTime = dayTime;
	}
	public String getWeekDiaryPath() {
		return weekDiaryPath;
	}
	public void setWeekDiaryPath(String weekDiaryPath) {
		this.weekDiaryPath = weekDiaryPath;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}

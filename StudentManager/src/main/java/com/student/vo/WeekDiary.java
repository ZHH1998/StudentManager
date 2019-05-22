package com.student.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 封装学生在一周时间内做的事情
 * @author Administrator
 *
 */
public class WeekDiary implements Serializable {
	
	private static final long serialVersionUID = -7172529920171050811L;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date dayTime;
	private String address;
	private String records;
	private String studentName;
	public Date getDayTime() {
		return dayTime;
	}
	public void setDayTime(Date dayTime) {
		this.dayTime = dayTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecords() {
		return records;
	}
	public void setRecords(String records) {
		this.records = records;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "WeekDiary [dayTime=" + dayTime + ", address=" + address + ", records=" + records + ", studentName="
				+ studentName + "]";
	}
	
}

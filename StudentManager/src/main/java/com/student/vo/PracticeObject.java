package com.student.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PracticeObject implements Serializable{
	/**
	 * 封装了学生的实习报告的内容
	 */
	private static final long serialVersionUID = -5510350917789044533L;
	
	private Integer classId;//班级编号
	private String name;//学生名字
	private String records;//工作内容
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date workTime;//实习报告时间
	private String practiceName;//实习报告名称
	private String prteacher;//实习老师
	
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}
	public String getRecords() {
		return records;
	}
	public void setRecords(String records) {
		this.records = records;
	}
	
	public String getPracticeName() {
		return practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}
	public String getPrteacher() {
		return prteacher;
	}
	public void setPrteacher(String prteacher) {
		this.prteacher = prteacher;
	}
	
}

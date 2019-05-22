package com.student.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ThesisObject implements Serializable{
	
	private static final long serialVersionUID = 8116610453790544152L;
	
	private String thesisName;//学生姓名
	private String thesisTeacher;//论文指导老师
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date thesisTime;//论文时间
	private String recos;//论文内容
	
	public String getThesisName() {
		return thesisName;
	}
	public void setThesisName(String thesisName) {
		this.thesisName = thesisName;
	}
	public String getThesisTeacher() {
		return thesisTeacher;
	}
	public void setThesisTeacher(String thesisTeacher) {
		this.thesisTeacher = thesisTeacher;
	}
	public Date getThesisTime() {
		return thesisTime;
	}
	public void setThesisTime(Date thesisTime) {
		this.thesisTime = thesisTime;
	}
	public String getRecos() {
		return recos;
	}
	public void setRecos(String recos) {
		this.recos = recos;
	}
	
	
}

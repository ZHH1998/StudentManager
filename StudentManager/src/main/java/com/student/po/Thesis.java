package com.student.po;

import java.io.Serializable;
import java.util.Date;

public class Thesis implements Serializable{
	private static final long serialVersionUID = 6423697106497378929L;
	
	private Long thesisId;//毕业论文ID
	private String thesisName;//学生姓名
	private String thesisTeacher;//指导老师
	private Date thesisTime;//论文时间
	private String thesisDiaryPath;//工作内容
	
	
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
	public Long getThesisId() {
		return thesisId;
	}
	public void setThesisId(Long thesisId) {
		this.thesisId = thesisId;
	}
	
	public Date getThesisTime() {
		return thesisTime;
	}
	public void setThesisTime(Date thesisTime) {
		this.thesisTime = thesisTime;
	}
	public String getThesisDiaryPath() {
		return thesisDiaryPath;
	}
	public void setThesisDiaryPath(String thesisDiaryPath) {
		this.thesisDiaryPath = thesisDiaryPath;
	}
	
	
}

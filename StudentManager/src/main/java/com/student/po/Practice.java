package com.student.po;

import java.io.Serializable;
import java.util.Date;

public class Practice implements Serializable{
		
	private static final long serialVersionUID = 2795662395780502678L;
	private Integer studentId;//实习id
	private String site;//实习地点
	private Date workTime;//实习报告时间
	private String practiceName;//实习报告名称
	private String  prteacher;//实习老师
	private String workDetails;//工作内容路径（相对路径）
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Date getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
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
	public String getWorkDetails() {
		return workDetails;
	}
	public void setWorkDetails(String workDetails) {
		this.workDetails = workDetails;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

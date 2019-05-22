package com.student.po;

import java.util.Date;

public class Teacher extends Student{

	private static final long serialVersionUID = 2381695706313002780L;
	private Integer teacherId;//教师编号
	private String teacherName;//教师名字
	private String teacherTitle;//教师职称
	private Date entryDate;//入职日期
	private Integer collegeId;//专业编号
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherTitle() {
		return teacherTitle;
	}
	public void setTeacherTitle(String teacherTitle) {
		this.teacherTitle = teacherTitle;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherTitle=" + teacherTitle
				+ ", entryDate=" + entryDate + ", collegeId=" + collegeId + "]";
	}
	
}

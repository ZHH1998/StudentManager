package com.student.po;

import java.io.Serializable;

public class Study implements Serializable{
	private static final long serialVersionUID = -6933256120212787347L;
	private Integer studyId;	//序号id
	private Integer studentId;	//学生id
	private Integer courseId;	//课程id
	public Integer getStudyId() {
		return studyId;
	}
	public void setStudyId(Integer studyId) {
		this.studyId = studyId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Study [studyId=" + studyId + ", studentId=" + studentId + ", courseId=" + courseId + "]";
	}
}

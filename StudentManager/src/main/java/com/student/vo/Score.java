package com.student.vo;

import java.io.Serializable;

public class Score implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 2223681407132924420L;
	private Integer scoreId;
	private Long studentId;
	private Integer courseId;
	private Integer score;
	public Score() {
		super();
	}
	public Score(Integer scoreId, Long studentId, Integer courseId, Integer score) {
		super();
		this.scoreId = scoreId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.score = score;
	}
	public Integer getScoreId() {
		return scoreId;
	}
	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", studentId=" + studentId + ", courseId=" + courseId + ", score=" + score
				+ "]";
	}
	
	
	
}

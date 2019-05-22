package com.student.service;

import java.util.List;

import com.student.po.StudentCourse;
import com.student.vo.PageObject;
import com.student.vo.Score;
import com.student.vo.ScoreEnd;

public interface StudySerivce {
	List<StudentCourse> findStudentId(Integer studentId);
	
	PageObject<ScoreEnd> findScore();
}

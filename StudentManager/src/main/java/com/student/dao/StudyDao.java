package com.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.student.po.StudentCourse;
import com.student.vo.Score;

public interface StudyDao {
	/**
	 * 	根据学生id查看课程id
	 * @param studentId 学生id
	 * @return 返回课程id
	 */
	List<Integer> findStudentId(Integer studentId);
	/**
	 *   根据拿到的课程id，拿区课程信息
	 * @param findStudentId
	 * @return
	 */
	List<StudentCourse> findCourseName(@Param("courseId") List<Integer> findStudentId);
	/**
	 * 	根据学生id查看成绩信息
	 */
	List<Score> findScore();
	
}

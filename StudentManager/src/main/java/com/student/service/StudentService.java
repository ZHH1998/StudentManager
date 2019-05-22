package com.student.service;

import com.student.po.Student;
import com.student.vo.PageObject;

public interface StudentService {
	/**
	 * 查询所有学生信息
	 * @param name
	 * @param pageCurrent
	 * @return
	 */
	PageObject<Student> findPageObjects(
			String name,
			Integer pageCurrent);
	
	/**
	 * 根据学生id删除信息
	 * @param studentId
	 * @return
	 */
	int deleteObjectsByStudentIds(Long[] studentIds);
	
	
	/**
	 * 根据学生id更新学生信息
	 * @param studentId
	 * @return
	 */
	int updateObjectByStudentId(Student student);
	
	/**
	 * 新增学生信息
	 * @param student
	 * @return
	 */
	int insertObject(Student student);
	
	Student findStudentById(Long studentId);
}

package com.student.service;

import com.student.po.Student;
import com.student.po.Teacher;
import com.student.vo.PageObject;

public interface TeacherService {

	/**
	 * 查询所有教师信息
	 * @param name
	 * @param pageCurrent
	 * @return
	 */
	PageObject<Teacher> findPageObjects(
			String name,
			Integer pageCurrent);
	
	/**
	 * 根据教师id删除信息
	 * @param studentId
	 * @return
	 */
	int deleteObjectsByTeacherIds(Long[] teacherIds);
	
	
	/**
	 * 根据教师id更新学生信息
	 * @param studentId
	 * @return
	 */
	int updateObjectByTeacherId(Teacher teacher);
	
	/**
	 * 新增教师信息
	 * @param student
	 * @return
	 */
	int insertObject(Teacher teacher);
	
	
}

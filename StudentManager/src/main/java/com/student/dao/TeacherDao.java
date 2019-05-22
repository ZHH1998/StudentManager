package com.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.student.po.Teacher;

public interface TeacherDao {

	/**
	 * 查询所有教师信息
	 * @param teacherName
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<Teacher> findPageObjects(
			@Param("teacherName")String teacherName,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
	/**
	 * 查询总记录数
	 * @param teacherName
	 * @return
	 */
	int getRowCount(
			@Param("teacherName")String teacherName);
	
	/**
	 * 根据教师id删除教师信息
	 * @param teacherIds
	 * @return
	 */
	int deleteObjectsByTeacherIds(
			@Param("teacherIds")Long[] teacherIds);
	
	/**
	 * 根据教师id更新教师信息
	 * @param teacher
	 * @return
	 */
	int updateObjectByTeacherId(
			Teacher teacher);
	
	/**
	 * 新增教师信息
	 * @param teacher
	 * @return
	 */
	int insertObject(
			Teacher teacher);

	/**
	 * 根据教师账号查找教师信息
	 * @param account
	 * @return
	 */
	Teacher findTeacherByAccount(
			@Param("account")String account);
}

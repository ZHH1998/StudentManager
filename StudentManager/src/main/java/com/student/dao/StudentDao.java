package com.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.student.po.Student;

public interface StudentDao {

	/**
	 * 查询所有学生信息
	 * @param name
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<Student> findPageObjects(
			@Param("name")String name,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
	/**
	 * 查询总记录数
	 * @param name
	 * @return
	 */
	int getRowCount(
			@Param("name")String name);
	
	/**
	 * 根据学生id删除学生信息
	 * @param studentIds
	 * @return
	 */
	int deleteObjectsByStudentIds(
			@Param("studentIds")Long[] studentIds);
	
	/**
	 * 根据学生id更新学生信息
	 * @param student
	 * @return
	 */
	int updateObjectByStudentId(
			Student student);
	
	/**
	 * 新增学生信息
	 * @param student
	 * @return
	 */
	int insertObject(
			Student student);

	/**
	 * 根据学生账号查找学生信息
	 * @param account
	 * @return
	 */
	Student findStudentByAccount(
			@Param("account")String account);
	
	Student findStudentById(@Param("studentId")Long studentId);
}

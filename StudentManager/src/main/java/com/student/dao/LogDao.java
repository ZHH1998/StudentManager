package com.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.student.po.Log;

public interface LogDao {

	/**
	 *   将日志信息写入到数据库
	 * @param entity
	 * @return
	 */
	int insertObject(Log entity);
	/**
	 * 基于条件查询当前页要呈现的日志信息
	 * @param username 用户名
	 * @param startIndex 当前页起始位置
	 * @param pageSize 页面大小(每页最多显示多少行记录)
	 * @return 当前页记录
	 */
	List<Log> findPageObjects(
			@Param("username")String username,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	/**
	 * 基于查询条件统计总记录数
	 * @param username 查询条件
	 * @return 总记录数
	 */
	int getRowCount(@Param("username")String username);
	/**
	 * 基于id删除日志信息
	 * @param id
	 * @return
	 */
	int deleteObjects(
    @Param("ids")Integer... ids);
	
}

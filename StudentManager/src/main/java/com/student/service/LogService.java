package com.student.service;

import com.student.po.Log;
import com.student.vo.PageObject;

/**
 * 日志模块业务接口：负责日志业务的规范定义
 */
public interface LogService{
	 
	/**
	 * 基于id执行日志删除业务
	 * @param 对应多个id的值
	 * @return 删除记录的行数
	 */
	int deleteObjects(Integer... ids);
	
	/**
	 * 按条件执行用户行为日志的查询操作
	 * @param pageCurrent 当前页码
	 * @param username 查询条件
	 * @return 当前需要呈现的日志数据
	 */
	PageObject<Log> findPageObjects(
			Integer pageCurrent,
			String username);
	
}






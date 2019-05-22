package com.student.dao;

import com.student.po.Practice;

public interface PracticeDao {
/**
 * 查询所有实习信息
 */
	public Practice findObject(Long studentId);
}

package com.student.dao;

import com.student.po.Thesis;

public interface ThesisDao {
	/**
	 * 基于ID查询所以毕业信息
	 * @param thesisId
	 * @return
	 */
	Thesis findById(Long thesisId);
}

package com.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.student.po.InternshipCompany;

public interface InternshipCompanyDao {
	
	List<InternshipCompany> findPageObjects(
			@Param("companyId")Integer companyId,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);

	int updateObject(InternshipCompany internshipCompany);
	
	int deleteObject(Integer companyId);

	int getRowCount();

	
}

package com.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentInternshipCompanyDao {
	/**
	 * 基于学生id查询实习单位id
	 * @param roleId
	 * @return
	 */
	List<Integer> findInternshipCompanyIdsByStudentIds(
	@Param("internshipCompanyIds")Integer[] companyIds);
	int deleteInternshipCompanyvByStudentId();
}

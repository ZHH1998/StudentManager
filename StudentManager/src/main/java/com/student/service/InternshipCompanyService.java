package com.student.service;

import com.student.po.InternshipCompany;
import com.student.vo.PageObject;

public interface InternshipCompanyService {
	PageObject<InternshipCompany> findPageObjects(Integer companyId,Integer pageCurrent);

	int updateObject(InternshipCompany internshipCompany);
	 int deleteObject(Integer companyId);
}

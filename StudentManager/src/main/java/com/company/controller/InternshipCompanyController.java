package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.InternshipCompany;
import com.student.service.InternshipCompanyService;
import com.student.vo.JsonResult;
import com.student.vo.PageObject;

@Controller
@RequestMapping("/internshipCompany/")
public class InternshipCompanyController {
	@Autowired
	private InternshipCompanyService internshipCompanyService;
	@RequestMapping("doInternshipCompanyListUI")
	  public String doInternshipCompanyListUI(){
		  return "pages/internshipCompany-list";
	  }
	 @RequestMapping("doFindPageObjects")
	  @ResponseBody
	  public JsonResult doFindPageObjects(
			  Integer companyId,Integer pageCurrent){
		  PageObject<InternshipCompany> pageObject=
		  internshipCompanyService.findPageObjects(companyId,pageCurrent);
		  return new JsonResult(pageObject);
	  }
	 @RequestMapping("doUpdateObject")
	 @ResponseBody
	 private JsonResult doUpdateObject(InternshipCompany internshipCompany){
		 internshipCompanyService.updateObject(internshipCompany);
		 return new JsonResult("update ok");
	 }
	 @RequestMapping("doDeleteObject")
	 @ResponseBody
	 private JsonResult doDeleteObject(Integer companyId){
		 internshipCompanyService.deleteObject(companyId);
		 return new JsonResult("delete ok");
	 }
}

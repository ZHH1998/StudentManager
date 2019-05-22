package com.student.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.Log;
import com.student.service.LogService;
import com.student.vo.JsonResult;
import com.student.vo.PageObject;

@Controller//告诉spring，此类交给spring管理
@RequestMapping("/log/") //定义对外的url
public class LogController {
	
	 @Autowired
	 private LogService logService;
	
	 @RequestMapping("doLogListUI")
	 public String doLogListUI() {
		 return "logInformation";
	 }
	 
	 @RequestMapping("doDeleteObjects")
	 @ResponseBody
	 public JsonResult doDeleteObjects(
		 Integer...ids) {//1,2,3,4
		 logService.deleteObjects(ids);
		 return new JsonResult("delete ok");
	 }
	 
	 @RequestMapping("doFindPageObjects")
	 @ResponseBody
	 public JsonResult doFindPageObjects(
			Integer pageCurrent,String username){
		    PageObject<Log> pageObject=
		    		logService.findPageObjects(pageCurrent, username);
	        return new JsonResult(pageObject);
	 }
}





package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.service.PracticeService;
import com.student.vo.JsonResult;

@Controller
@RequestMapping("/")
public class PracticeController {
	@Autowired
	private PracticeService practiceService;
	
	@ResponseBody
	@RequestMapping("findPracticel")
	public JsonResult findPracticel(Long studentId) {
		return new JsonResult(practiceService.allNewsInfo(studentId));
	}
}

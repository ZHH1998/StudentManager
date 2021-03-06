package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.service.ThesisService;
import com.student.vo.JsonResult;

@Controller
@RequestMapping("/")
public class ThesisController {

	@Autowired
	private ThesisService thesisService;
	
	@RequestMapping("findThesis")
	@ResponseBody
	public JsonResult findThesis(Long thesisId) {
		return new JsonResult(thesisService.findById(thesisId));
	}
	
}

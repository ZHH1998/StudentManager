package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.StudentCourse;
import com.student.service.StudySerivce;
import com.student.vo.JsonResult;
import com.student.vo.PageObject;
import com.student.vo.Score;
import com.student.vo.ScoreEnd;

@Controller
@RequestMapping("/course/")
public class StudyController {

	@Autowired
	private StudySerivce studySerivce;
	
	@RequestMapping("findCourseName")
	@ResponseBody
	public JsonResult findCourseName(Integer id) {
		List<StudentCourse> name = studySerivce.findStudentId(id);
		return new JsonResult(name);
	}

	@RequestMapping("doFindScore")
	@ResponseBody
	public JsonResult doFindScore() {
		PageObject<ScoreEnd> findScore = studySerivce.findScore();
		return new JsonResult(findScore);
	}
}

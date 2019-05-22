package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.Week;
import com.student.service.WeekDiaryService;
import com.student.vo.JsonResult;
import com.student.vo.WeekDiary;

@Controller
@RequestMapping("/weekDiary/")
public class WeekDiaryController {
	@Autowired
	private WeekDiaryService weekDiaryService;
	@RequestMapping("findDiaryById")
	@ResponseBody
	public JsonResult findDiaryById(Long studentId){
		WeekDiary weekDiary = weekDiaryService.findDiaryById(studentId);
		return new JsonResult(weekDiary);
	}
	@RequestMapping("saveWeekDiary")
	@ResponseBody
	public JsonResult saveWeekDiary(Week week,String textContent){
		weekDiaryService.saveWeekDiary(week,textContent);
		return new JsonResult("save ok");
	}
}

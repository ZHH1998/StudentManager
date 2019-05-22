package com.student.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.Teacher;
import com.student.service.TeacherService;
import com.student.vo.JsonResult;

@Controller
@RequestMapping("/teacher/")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String name,Integer pageCurrent) {
		return new JsonResult(teacherService.findPageObjects(name, pageCurrent));
	}
	
	@RequestMapping("doLogin")
	@ResponseBody
	public JsonResult doLogin(String username,String password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		subject.login(token);
		return new JsonResult("登录成功");
	}
	
	@RequestMapping("doDeleteObjects")
	@ResponseBody     
	public JsonResult doDeleteObjects(Long[] teacherIds) {
		teacherService.deleteObjectsByTeacherIds(teacherIds);
		return new JsonResult("删除成功");
	}
	
	@RequestMapping("doUpdateObject")
	@ResponseBody
	public JsonResult doUpdateObject(Teacher teacher) {
		teacherService.updateObjectByTeacherId(teacher);
		return new JsonResult("修改成功");
	}
}

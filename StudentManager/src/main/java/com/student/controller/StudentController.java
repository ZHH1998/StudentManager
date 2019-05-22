package com.student.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.Student;
import com.student.service.StudentService;
import com.student.vo.JsonResult;

@Controller
@RequestMapping("/student/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String name,Integer pageCurrent) {
		if(pageCurrent == null || pageCurrent == 0) {
			pageCurrent = 1;
		}
		return new JsonResult(studentService.findPageObjects(name, pageCurrent));
	}
	
	@RequestMapping("doFindStudentById")
	@ResponseBody
	public JsonResult doFindStudentById(Long studentId) {
		return new JsonResult(studentService.findStudentById(studentId));
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
	public JsonResult doDeleteObjects(Long[] studentIds) {
		studentService.deleteObjectsByStudentIds(studentIds);
		return new JsonResult("删除成功");
	}
	
	@RequestMapping("doUpdateObject")
	@ResponseBody
	public JsonResult doUpdateObject(Student student) {
		studentService.updateObjectByStudentId(student);
		return new JsonResult("修改成功");
	}
	
	@RequestMapping("doRegisterStudent")
	@ResponseBody
	public JsonResult doRegisterStudent(String account, String password) {
		Student student  = new Student();
		student.setAccount(account);
		student.setPassword(password);
		studentService.insertObject(student);
		return new JsonResult("注册成功");
	}
	
	
}

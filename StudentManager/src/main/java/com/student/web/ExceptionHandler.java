package com.student.web;

import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
/**
 * 全局异常处理类
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.vo.JsonResult;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public JsonResult doExceptionHandler(RuntimeException e) {
		e.printStackTrace();
		return new JsonResult(e);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ShiroException.class)
	@ResponseBody
	public JsonResult doHandleShiroException(ShiroException e) {
		JsonResult result = new JsonResult();
		result.setState(0);
		if (e instanceof UnknownAccountException) {
			result.setMessage("用户名不存在");
		} else if (e instanceof LockedAccountException) {
			result.setMessage("用户已被锁定");
		} else if (e instanceof IncorrectCredentialsException) {
			result.setMessage("密码不正确");
		} else if (e instanceof AuthorizationException) {
			result.setMessage("没有权限");
		} else {
			result.setMessage("系统正在维护中");
		}
		e.printStackTrace();
		return result;
	}
}

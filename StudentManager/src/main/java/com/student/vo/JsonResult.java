package com.student.vo;

import java.io.Serializable;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = -5049402612386226751L;
	private int state=1;//1为success,0为erro
	private Object data;//数据
	private String message="ok";//状态信息
	
	public JsonResult() {
	}

	public JsonResult(Throwable e) {
		this.state = 0;
		this.message = e.getMessage();
	}

	public JsonResult(Object data) {
		this.data = data;
	}

	public JsonResult(String message) {
		this.message = message;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", data=" + data + ", message=" + message + "]";
	}
	
}

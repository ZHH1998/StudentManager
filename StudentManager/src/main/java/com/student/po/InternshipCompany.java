package com.student.po;

import java.io.Serializable;

public class InternshipCompany implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer companyId;//实习公司Id
	private String companyName;
	private String adrr;//实习单位地址
	private String email;//
	private String phone;//单位电话
	
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String getAdrr() {
		return adrr;
	}
	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

package com.student.po;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{

	private static final long serialVersionUID = 8015059884892000008L;
	private Long studentId;//学生编号
	private String account;//学生账号
	private String name;//学生名字
	private String password;//登录密码
	private String idCard;//身份证
	private String sex;//性别
	private String education;//学历
	private String schoolId;//专业学校
	private String professional;//专业
	private Date acceptanceDate;//入学日期
	private Date birthday;//出生日期
 	private String status;//状态
	private String tel;//联系电话
	private String secondTel;//第二联系电话
	private String qq;//QQ
	private String email;//邮箱
	private String address;//地址
	private Integer classId;//班级编号
	private Integer isAdmin;//是否管理员
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public Date getAcceptanceDate() {
		return acceptanceDate;
	}
	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSecondTel() {
		return secondTel;
	}
	public void setSecondTel(String secondTel) {
		this.secondTel = secondTel;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Integer getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", account=" + account + ", name=" + name + ", password=" + password
				+ ", idCard=" + idCard + ", sex=" + sex + ", education=" + education + ", schoolId=" + schoolId
				+ ", professional=" + professional + ", acceptanceDate=" + acceptanceDate + ", birthday=" + birthday
				+ ", status=" + status + ", tel=" + tel + ", secondTel=" + secondTel + ", qq=" + qq + ", email=" + email
				+ ", address=" + address + ", classId=" + classId + ", isAdmin=" + isAdmin + "]";
	}
	
}

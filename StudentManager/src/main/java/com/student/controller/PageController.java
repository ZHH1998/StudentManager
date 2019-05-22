package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	@RequestMapping("doLoginUI")
	public String doLoginUI() {
		return "login";
	}
	
	
	@RequestMapping("doRegisterUI")
	public String doRegisterUI() {
		System.out.println("---------------");
		return "register";
	}

	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "index";
	}
	
	/**
	 * 加载的是显示学生的页面信息
	 * @return
	 */
	@RequestMapping("doStudentInformationUI")
	public String doStudentInformationUI() {
		return "studentInformation";
	}
	
	/**
	 * 加载的是老师页面信息
	 * @return
	 */
	@RequestMapping("doTeacherInformationUI")
	public String doTeacherInformationUI() {
		return "teacherInformation";
	}

	/**
	 * 日志信息
	 */
	@RequestMapping("doLogInformationUI")
	public String doLogInformationUI() {
		return "logInformation";
	}
	
	/**
	 * 得到分页页面
	 * @return
	 */
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "page";
	}
	
	/**
	 * 得到是添加个人信息页面
	 * @return
	 */
	@RequestMapping("doAddPersonalDataUI")
	public String doAddPersonalDataUI() {
		return "addPersonalData";
	}
	
	/**
	 * 更新密码
	 * @return
	 */
	@RequestMapping("doUpdatePasswordUI")
	public String doUpdatePasswordUI() {
		return "updatePassword";
	}
	
	
	/**
	 * 跳转到毕业润文显示页面
	 * @return
	 */
	@RequestMapping("doGradutePaperUI")
	public String doGradutePaperUI() {
		return "graduatepaper";
	}
	
	/**
	 * 跳转到显示实习周记信息页面
	 * @return
	 */
	@RequestMapping("doInternWeeklyDiaryPaperUI")
	public String doInternWeeklyDiaryPaperUI() {
		return "Internweeklydiary";
	}
	
	
	/**
	 * 跳转到添加周记页面
	 * @return
	 */
	@RequestMapping("doAddWeeklyReportUI")
	public String doAddWeeklyReportUI() {
		return "add-intern-weeklydiary";
	}
	
	/**
	 * 跳转到添加签约单位
	 * @return
	 */
	@RequestMapping("doAddContractUnitUI")
	public String doAddContractUnitUI() {
		return "add-contract-unit";
	}
	
	/**
	 * 添加实习单位
	 * @return
	 */
	@RequestMapping("doAddInternshiptUnitUI")
	public String doAddInternshiptUnitUI() {
		return "add-internship-unit";
	}
	
	@RequestMapping("doCourseinFormationUI")
	public String doCourseinFormationUI() {
		return "course-information";
	}
	
	@RequestMapping("doScoreInformationUI")
	public String doScoreInformationUI() {
		return "score-information";
	}
	
}

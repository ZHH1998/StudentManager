package com.student.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.PracticeDao;
import com.student.dao.StudentDao;
import com.student.exception.ServiceException;
import com.student.po.Practice;
import com.student.po.Student;
import com.student.service.PracticeService;
import com.student.vo.PracticeObject;

@Service
public class PracticeServicempl implements PracticeService{
	@Autowired
	private PracticeDao practice;

	@Autowired
	private StudentDao studentDao;

	/**
	 * 项目BUG没有解决，只有先行注释了
	 */
	@Override
	public PracticeObject allNewsInfo(Long studentId) {
		
		return null;
//		if(studentId==null)
//			throw new ServiceException("实习报告学生id格式有误");
//		Practice practices = practice.findObject(studentId);
//		if(practices==null)
//			throw new ServiceException("实现报告可能不存在！");
//		Student student = studentDao.findStudentByIdS(studentId);
//		if(student==null)
//			throw new ServiceException("学生Id不能为空");
//		System.out.println("内容数据路径没问题的"+practices.getWorkDetails());
//		String workDetails = this.getClass().getClassLoader().getResource("/").getPath()+practices.getWorkDetails();
//		BufferedReader in=null;
//		String records=null;
//		try {
//			in=new BufferedReader(new InputStreamReader(new FileInputStream(workDetails), "UTF-8"));
//			StringBuilder sb = new StringBuilder();
//			String line;
//			while((line = in.readLine())!= null) {
//				System.out.println(line);
//				sb.append(line+"</br>");
//			}
//			String studentName = student.getName();
//			Integer studentClassId = student.getClassId();
//			Date practiceWortTime = practices.getWorkTime();
//			String practiceName = practices.getPracticeName();
//			String prteacher = practices.getPrteacher();
//			records=sb.toString();
//			PracticeObject objects = new PracticeObject();
//			objects.setName(studentName);
//			objects.setWorkTime(practiceWortTime);
//			objects.setClassId(studentClassId);
//			objects.setRecords(records);
//			objects.setPracticeName(practiceName);
//			objects.setPrteacher(prteacher);
//			return objects;
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new ServiceException("数据为空",e);
//		}finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}

package com.student.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.student.dao.StudentDao;
import com.student.dao.WeekDiaryDao;
import com.student.exception.ServiceException;
import com.student.po.Student;
import com.student.po.Week;
import com.student.service.WeekDiaryService;
import com.student.vo.WeekDiary;
@Service
public class WeekDiaryServiceImpl implements WeekDiaryService {
@Autowired	
private StudentDao studentDao;
@Autowired
private WeekDiaryDao weekDiaryDao;
	@Override
	public WeekDiary findDiaryById(Long studentId) {
		if(studentId==null){
			throw new ServiceException("学生id格式有误");
		}
		
		Student student = studentDao.findStudentById(studentId);
		if(student==null){
			throw new ServiceException("你查找的周记不存在");
		}
		Week practice = weekDiaryDao.findPracticeByStudentId(studentId);
		if(practice==null){
			throw new ServiceException("你查找的实习记录不存在");
		}
		String weekDiaryPath=practice.getWeekDiaryPath();
		BufferedReader in = null;
		//测试weekDiaryPath是否可行
		weekDiaryPath=this.getClass().getClassLoader().getResource("/").getPath()+weekDiaryPath;
		String b=null;
		String records=null;
		try {
			in=new BufferedReader(new InputStreamReader(new FileInputStream(weekDiaryPath),"utf-8"));
			 StringBuilder sb = new StringBuilder();
			while((b=in.readLine())!=null){
				//测试打印周记内容
				System.out.println(b);
				 sb.append(b+"\n");
			}

			//封装周记信息
			String studentName=student.getName();
			 Date dayTime=practice.getDayTime();
			 String address=practice.getAddress();
			 records=sb.toString();
			 System.out.println(records);
			WeekDiary weekDiary = new WeekDiary();
			weekDiary.setStudentName(studentName);
			weekDiary.setDayTime(dayTime);
			weekDiary.setAddress(address);
			weekDiary.setRecords(records);
			return weekDiary;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServiceException("没有找到你要找的东西",e);
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	@Override
		public int saveWeekDiary(Week week,String textContent) {
			if(week==null){
				throw new ServiceException("所写周记不能为空");
			}
			if(StringUtils.isEmpty(week.getStudentName())){
				throw new ServiceException("所写人不能为空");
			}
			int rows = weekDiaryDao.saveWeekDiary(week);
			if(rows==0){
				throw new ServiceException("保存失败");
			}
			String weekDiaryPath=this.getClass().getClassLoader().getResource("/").getPath()+week.getWeekDiaryPath();
			File file = new File(weekDiaryPath);
			FileWriter fw=null; 
			if(!file.exists()){
				try {
					file.createNewFile();
					fw=new FileWriter(file);
					BufferedWriter out = new BufferedWriter(fw);
					out.write(textContent, 0, textContent.length()-1);
					out.close();

					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new ServiceException("文件初始化失败");
				}
			}
			return rows;
			
		}

}

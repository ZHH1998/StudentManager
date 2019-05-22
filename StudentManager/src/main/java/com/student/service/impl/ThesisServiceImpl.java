package com.student.service.impl;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.ThesisDao;
import com.student.exception.ServiceException;
import com.student.po.Thesis;
import com.student.service.ThesisService;
import com.student.vo.ThesisObject;

@Service
public class ThesisServiceImpl implements ThesisService{
	@Autowired
	private ThesisDao thesisDao;
	

	@Override
	public ThesisObject findById(Long thesisId) {
		if(thesisId==null)
			throw new ServiceException("ID不能为空");
		Thesis thes = thesisDao.findById(thesisId);
		if(thes==null)
			throw new ServiceException("毕业论文可能不存在！");
		String thesisDetails = this.getClass().getClassLoader().getResource("/").getPath()+thes.getThesisDiaryPath();
		BufferedReader in=null;
		String recos=null;
			try {
				in=new BufferedReader(new InputStreamReader(new FileInputStream(thesisDetails), "UTF-8"));
				StringBuilder sb = new StringBuilder();
				String line;
				while((line = in.readLine())!= null) {
				     System.out.println(line);
				     sb.append(line+"\n");
				  }
				String thesisName = thes.getThesisName();
				Date thesisTime = thes.getThesisTime();
				String thesisTeacher = thes.getThesisTeacher();
				recos=sb.toString();
				ThesisObject thos = new ThesisObject();
				thos.setThesisName(thesisName);
				thos.setThesisTeacher(thesisTeacher);
				thos.setThesisTime(thesisTime);
				thos.setRecos(recos);
				return thos;
			} catch (IOException e) {
				e.printStackTrace();
				throw new ServiceException("数据为空",e);
			}finally {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	
}

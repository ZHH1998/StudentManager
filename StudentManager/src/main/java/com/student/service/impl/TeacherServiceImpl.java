package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.TeacherDao;
import com.student.exception.ServiceException;
import com.student.po.Teacher;
import com.student.service.TeacherService;
import com.student.util.PageUtil;
import com.student.vo.PageObject;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	public PageObject<Teacher> findPageObjects(String teacherName, Integer pageCurrent) {
		if (pageCurrent==null||pageCurrent<1) {
			throw new IllegalArgumentException("页码参数不合法");
		}
		int rowCount = teacherDao.getRowCount(teacherName);
		if (rowCount==0) {
			throw new ServiceException("没有记录");
		}
		int pageSize = 3;
		int startIndex = (pageCurrent-1)*pageSize;
		List<Teacher> records;
		try {
			records = 
				teacherDao.findPageObjects(teacherName, startIndex, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		return PageUtil.newInstance(pageSize, rowCount, pageCurrent, records);
	}

	@Override
	public int deleteObjectsByTeacherIds(Long[] teacherIds) {
		if (teacherIds==null||teacherIds.length==0) {
			throw new IllegalArgumentException("请先选择");
		}
		int rows = 0;
		try {
			rows = teacherDao.deleteObjectsByTeacherIds(teacherIds);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		if (rows==0) {
			throw new ServiceException("记录可能已经不存在了");
		}
		return rows;
	}

	@Override
	public int updateObjectByTeacherId(Teacher teacher) {
		if (teacher.getStudentId()==null) {
			throw new IllegalArgumentException("请先选择");
		}
		int rows = 0;
		try {
			rows = teacherDao.updateObjectByTeacherId(teacher);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		if (rows==0) {
			throw new ServiceException("记录可能已经不存在了");
		}
		return rows;
	}

	@Override
	public int insertObject(Teacher teacher) {
		if (teacher.getAccount()==null||teacher.getPassword()==null) {
			throw new IllegalArgumentException("用户名和密码不能为空");
		}
		int rows = 0;
		try {
			rows = teacherDao.insertObject(teacher);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		if (rows==0) {
			throw new ServiceException("请勿重复添加");
		}
		return rows;
	}

}

package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.exception.ServiceException;
import com.student.po.Student;
import com.student.service.StudentService;
import com.student.util.PageUtil;
import com.student.vo.PageObject;

@Service
public class StudentServiseImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public PageObject<Student> findPageObjects(String account, Integer pageCurrent) {
		if (pageCurrent==null||pageCurrent<1) {
			throw new IllegalArgumentException("页码参数不合法");
		}
		int rowCount = studentDao.getRowCount(account);
		if (rowCount==0) {
			throw new ServiceException("没有记录");
		}
		int pageSize = 3;
		int startIndex = (pageCurrent-1)*pageSize;
		List<Student> records;
		try {
			records = 
				studentDao.findPageObjects(account, startIndex, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		return PageUtil.newInstance(pageSize, rowCount, pageCurrent, records);
	}

	@Override
	public int deleteObjectsByStudentIds(Long[] studentIds) {
		if (studentIds==null||studentIds.length==0) {
			throw new IllegalArgumentException("请先选择");
		}
		int rows = 0;
		try {
			rows = studentDao.deleteObjectsByStudentIds(studentIds);
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
	public int updateObjectByStudentId(Student student) {
		if (student.getStudentId()==null) {
			throw new IllegalArgumentException("请先选择");
		}
		int rows = 0;
		try {
			rows = studentDao.updateObjectByStudentId(student);
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
	public int insertObject(Student student) {
		if (student.getAccount()==null||student.getPassword()==null) {
			throw new IllegalArgumentException("用户名和密码不能为空");
		}
		int rows = 0;
		try {
			rows = studentDao.insertObject(student);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("系统正在维护中");
		}
		if (rows==0) {
			throw new ServiceException("请勿重复添加");
		}
		return rows;
	}
	@Override
	public Student findStudentById(Long studentId) {
		if(studentId==null||studentId<1) throw new IllegalArgumentException("学生编号无效");
		Student stu = studentDao.findStudentById(studentId);
		if(stu==null) throw new ServiceException("记录可能已经不存在");
		return stu;
	}

}

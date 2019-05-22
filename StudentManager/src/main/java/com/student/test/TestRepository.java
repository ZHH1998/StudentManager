package com.student.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.student.dao.StudentDao;
import com.student.dao.TeacherDao;
import com.student.po.Student;
import com.student.po.Teacher;

public class TestRepository extends TestBase{

	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ac.getBean("dataSource",DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testSqlSessionFactory() {
		SqlSessionFactory bean = ac.getBean("sqlSessionFactory",SqlSessionFactory.class);
		System.out.println(bean);
	}
	
	@Test
	public void testStudentDao() {
		StudentDao bean = ac.getBean("studentDao",StudentDao.class);
		Student student = new Student();
		student.setAccount("wangke");
		student.setPassword("2541534");
		int rows = bean.insertObject(student);
		System.out.println(rows);
	}
	
	@Test
	public void testTeacherDao() {
		TeacherDao bean = ac.getBean("teacherDao",TeacherDao.class);
		Teacher teacher = new Teacher();
		teacher.setAccount("wangke");
		teacher.setPassword("123456");
		int rows = bean.insertObject(teacher);
		System.out.println(rows);
	}
}

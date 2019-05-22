package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.dao.StudyDao;
import com.student.exception.ServiceException;
import com.student.po.StudentCourse;
import com.student.po.Study;
import com.student.service.StudySerivce;
import com.student.vo.PageObject;
import com.student.vo.Score;
import com.student.vo.ScoreEnd;
@Service
public class StudySerivceImp implements StudySerivce {

	@Autowired
	private StudyDao studydao;

	@Autowired
	private StudentDao studentDao;


	@Override
	public List<StudentCourse> findStudentId(Integer studentId) {
		List<Integer> courseId = studydao.findStudentId(studentId);
		if(courseId==null||courseId.size()==0)throw new IllegalArgumentException("学生没有课程安排");
		List<StudentCourse> course = studydao.findCourseName(courseId);
		if(course==null) throw new ServiceException("学生课程信息不存在");
		return course;
	}
	
	
	@Override
	public PageObject<ScoreEnd> findScore() {
		PageObject<ScoreEnd> page = new PageObject();
		List<Score> findScore = studydao.findScore();

		if (findScore==null||findScore.size()==0) {
			throw new IllegalArgumentException("输入的学号有误");
		}
		List<ScoreEnd> results = new ArrayList<>();
		for(Score score : findScore) {
			ScoreEnd scoreEnd = new ScoreEnd();
			scoreEnd.setScore(score.getScore());
			scoreEnd.setStudentName(studentDao.findStudentById((Long)score.getStudentId()).getName());
			scoreEnd.setStudetnAccount(studentDao.findStudentById((Long)score.getStudentId()).getAccount());
			List<Integer> one = new ArrayList<Integer>();
			one.add(score.getCourseId());
			scoreEnd.setCourseName(studydao.findCourseName(one).get(0).getCourseName());
			results.add(scoreEnd);
		}
		page.setRecords(results);
		return page;
	}

}

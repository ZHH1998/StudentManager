package com.student.dao;

import com.student.po.Week;

public interface WeekDiaryDao {
	Week findPracticeByStudentId(Long studentId);
	int  saveWeekDiary(Week week);
}

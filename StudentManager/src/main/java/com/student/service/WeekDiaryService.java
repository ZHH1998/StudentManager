package com.student.service;

import com.student.po.Week;
import com.student.vo.WeekDiary;

public interface WeekDiaryService {
	public WeekDiary findDiaryById(Long studentId);

	public int saveWeekDiary(Week week,String textContent);

	
}

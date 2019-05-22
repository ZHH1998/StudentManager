package com.student.util;

import java.util.List;

import com.student.vo.PageObject;

public class PageUtil {

	public static <T>PageObject<T> newInstance(
			Integer pageSize,
			Integer rowCount,
			Integer pageCurrent,
			List<T> records){
		PageObject<T> po = new PageObject<>();
		po.setPageCount((rowCount-1)/pageSize+1);
		po.setPageCurrent(pageCurrent);
		po.setPageSize(pageSize);
		po.setRecords(records);
		po.setRowCount(rowCount);
		return po;
	}
}

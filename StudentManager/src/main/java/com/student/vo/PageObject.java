package com.student.vo;

import java.io.Serializable;
import java.util.List;

public class PageObject<T> implements Serializable{

	private static final long serialVersionUID = -3998282955010066701L;
	/**当前页要呈现的记录*/
	private List<T> records;
	/**总记录数*/
	private Integer rowCount;
	/**总页数*/
	private Integer pageCount;
	/**页面大小*/
	private Integer pageSize;
	/**当前页页码*/
	private Integer pageCurrent;
	public List<T> getRecords() {
		return records;
	}
	public void setRecords(List<T> records) {
		this.records = records;
	}
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	@Override
	public String toString() {
		return "PageObject [records=" + records + ", rowCount=" + rowCount + ", pageCount=" + pageCount + ", pageSize="
				+ pageSize + ", pageCurrent=" + pageCurrent + "]";
	}

}

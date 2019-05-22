package com.student.service;

import java.util.List;
import java.util.Map;

import com.student.po.Menu;

public interface MenuService {
	/**
	 * 将菜单信息更新到数据库
	 * @param menu
	 * @return
	 */
	 int updateObject(Menu menu);
	  /**
	   * 将菜单信息保存到数据库
	   * @param menu
	   * @return
	   */
	  int saveObject(Menu menu);
	  /**
	   * 基于菜单id删除菜单以及对应的关系数据
	   * @param id
	   * @return
	   */
	  List<Map<String,Object>> findObjects();
	  int deleteObject(Integer menuId);
}

package com.student.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.student.po.Menu;

/** 菜单数据层对象*/
public interface MenuDao {
	/**
	 * 获取多个菜单id对应的权限标识
	 * @param menuIds
	 * @return
	 */
	List<String> findPermissions(
			@Param("menuIds")Integer[] menuIds);

	/**
	 * 将内存中的menu对象更新到数据库
	 * @return 修改的行数
	 */
	int updateObject(Menu menu);
	/**
	 * 将内存中的menu对象持久化到数据库
	 * @return 插入的行数
	 */
	int insertObject(Menu menu);

	/**
	 * 统计菜单是否有子菜单
	 * @param id
	 * @return 子菜单的个数
	 */
	int getChildCount(@Param("menuId")Integer menuId);
	/**
	 * 基于id删除菜单对象
	 * @return 删除的行数
	 */
	List<Map<String,Object>> findObjects();

	int deleteObject(Integer menuId);
}

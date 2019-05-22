package com.student.po;

import java.io.Serializable;

public class Menu implements Serializable{
	private static final long serialVersionUID = 5261314150893603921L;
	private Integer menuId;
	/**菜单名称*/
	private String name;
	/**菜单url: log/doFindPageObjects.do*/
	private String url;
	/**菜单类型(两种:按钮2,普通菜单1)*/
	private Integer type=1;
	/**排序(序号)*/
	private Integer sort;
	/**上级菜单id*/
	private Integer parentId;
	/**菜单对应的权限标识*/
	private String permission;
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", name=" + name + ", url=" + url + ", type=" + type + ", sort=" + sort
				+ ", parentId=" + parentId + ", permission=" + permission + "]";
	}
	
}

package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.po.Menu;
import com.student.service.MenuService;
import com.student.vo.JsonResult;

@Controller
@RequestMapping("/menu/")
public class MenuController {
	
	@Autowired
    private MenuService MenuService;
	
	/**返回菜单列表页面*/
	@RequestMapping("doMenuListUI")
	public String doMenuListUI() {
		return "sys/menu_list";
	}
	
	/**返回菜单编辑页面*/
	@RequestMapping("doMenuEditUI")
	public String doMenuEditUI() {
		return "sys/menu_edit";
	}
	
	@RequestMapping("doUpdateObject")
	@ResponseBody
	public JsonResult doUpdateObject(Menu menu) {
		MenuService.updateObject(menu);
		return new JsonResult("update ok");
	}
	@RequestMapping("doSaveObject")
	@ResponseBody
	public JsonResult doSaveObject(Menu menu) {
		MenuService.saveObject(menu);
		return new JsonResult("save ok");
	}
	
	@RequestMapping("doDeleteObject")
	@ResponseBody
	public JsonResult doDeleteObject(Integer menuId) {
		MenuService.deleteObject(menuId);
		return new JsonResult("delete ok");
	}
	
	/**
	 * 查询所有菜单以及对应的上级菜单信息
	 * @return
	 */
	@RequestMapping("doFindObjects")
	@ResponseBody
	public JsonResult doFindObjects() {
		return new JsonResult(
				MenuService.findObjects());
	}
}

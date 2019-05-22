package com.student.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.student.dao.MenuDao;
import com.student.dao.RoleMenuDao;
import com.student.exception.ServiceException;
import com.student.po.Menu;
import com.student.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
	private MenuDao MenuDao;
    
    //@Autowired
    //@Qualifier("RoleMenuDao")//只能配合autowired一起使用
    @Resource(name="roleMenuDao")//相当于如上两个注解
    private RoleMenuDao roleMenuDao;
    
    @Override
    public int updateObject(Menu menu) {
    	//1.校验参数
    	if(menu==null)
    		throw new IllegalArgumentException("保存对象不能为空");
    	if(StringUtils.isEmpty(menu.getName()))
    		throw new IllegalArgumentException("菜单名不能为空");
    	//....
    	//2.保存数据
    	int rows=MenuDao.updateObject(menu);
    	if(rows==0)
        throw new ServiceException("记录可能已经不存在");
    	//3.返回结果
    	return rows;
    }
    @Override
    public int saveObject(Menu menu) {
       //1.校验参数
    	if(menu==null)
        throw new IllegalArgumentException("保存对象不能为空");
    	if(StringUtils.isEmpty(menu.getName()))
    	throw new IllegalArgumentException("菜单名不能为空");
    	//....
       //2.保存数据
    	int rows=MenuDao.insertObject(menu);
       //3.返回结果
    	return rows;
    }
    
    @Override
    public int deleteObject(Integer menuId) {
    	//1.参数校验
    	if(menuId==null||menuId<1)
    	throw new IllegalArgumentException("id值无效");
    	//2.基于id判定此菜单是否有子元素
    	int childCount=MenuDao.getChildCount(menuId);
    	if(childCount>0)
    	throw new ServiceException("请先删除子元素");
    	//3.基于id删除菜单与角色关系数据
    	roleMenuDao.deleteObjectsByMenuId(menuId);
    	//4.基于id删除菜单自身数据
    	int rows=MenuDao.deleteObject(menuId);
    	if(rows==0)
    	throw new ServiceException("记录可能已经不存在");
    	//5.返回结果
    	return rows;
    }
	@Override
	public List<Map<String, Object>> findObjects() {
        List<Map<String,Object>> list=
        MenuDao.findObjects();
        if(list==null||list.size()==0)
        throw new ServiceException("记录不存在");
		return list;
	}
	
}
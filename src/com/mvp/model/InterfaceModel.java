/**
 * Copyright 2015 GYYM
 *
 * All right reserved
 *
 * Created on 2015-6-19 下午4:33:31
 * 
 */
package com.mvp.model;

import com.mvp.bean.UserBean;

/**
 * MVP 中的 M 数据逻辑层接口
 * @author Administrator
 *
 */
public interface InterfaceModel {
	
	void setID(int id);
	
	void setFirstName(String firstName);
	
	void setSecondName(String secondName);
	
	UserBean load(int id);
	
	void save(int id, String firstName, String secondName);

}

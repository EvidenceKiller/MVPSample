/**
 * Copyright 2015 GYYM
 *
 * All right reserved
 *
 * Created on 2015-6-19 下午4:26:50
 * 
 */
package com.mvp.view;

/**
 * MVP 中的 view 层接口
 * @author Administrator
 *
 */
public interface InterfaceView {

	int getID();
	
	String getFirstName();
	
	String getSecondName();
	
	void setFirstName(String firstName);
	
	void setSecondName(String secondName);
	
}

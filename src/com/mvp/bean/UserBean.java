/**
 * Copyright 2015 GYYM
 *
 * All right reserved
 *
 * Created on 2015-6-19 下午4:37:05
 * 
 */
package com.mvp.bean;

/**
 * @author Administrator
 *
 */
public class UserBean {
	
	private String firstName, secondName;
	
	public UserBean(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}

}

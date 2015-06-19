/**
 * Copyright 2015 GYYM
 *
 * All right reserved
 *
 * Created on 2015-6-19 下午4:33:19
 * 
 */
package com.mvp.model;

import android.util.SparseArray;

import com.mvp.bean.UserBean;

/**
 * MVP 中的 M 数据逻辑层
 * @author Administrator
 *
 */
public class Model implements InterfaceModel {
	
	private String firstName, secondName;
	private int id;
	private SparseArray<UserBean> sparseArray = new SparseArray<UserBean>();

	/* (non-Javadoc)
	 * @see com.mvp.model.InterfaceModel#setID(int)
	 */
	@Override
	public void setID(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.mvp.model.InterfaceModel#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	/* (non-Javadoc)
	 * @see com.mvp.model.InterfaceModel#setSecondName(java.lang.String)
	 */
	@Override
	public void setSecondName(String secondName) {
		// TODO Auto-generated method stub
		this.secondName = secondName;
	}

	/* (non-Javadoc)
	 * @see com.mvp.model.InterfaceModel#load(int)
	 */
	@Override
	public UserBean load(int id) {
		// TODO Auto-generated method stub
		this.id = id;
		UserBean userBean = sparseArray.get(id, new UserBean("not found", "not found"));
		return userBean;
	}

	/* (non-Javadoc)
	 * @see com.mvp.model.InterfaceModel#save(int, java.lang.String, java.lang.String)
	 */
	@Override
	public void save(int id, String firstName, String secondName) {
		// TODO Auto-generated method stub
		this.id = id;
		sparseArray.put(id, new UserBean(firstName, secondName));
	}

}

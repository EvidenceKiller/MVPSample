/**
 * Copyright 2015 GYYM
 *
 * All right reserved
 *
 * Created on 2015-6-19 下午4:31:19
 * 
 */
package com.mvp.presenter;

import com.mvp.bean.UserBean;
import com.mvp.model.InterfaceModel;
import com.mvp.model.Model;
import com.mvp.view.InterfaceView;

/**
 * @author Administrator
 *
 */
public class Presenter {
	
	private InterfaceView iView;
	private InterfaceModel iModel;
	
	public Presenter(InterfaceView view) {
		this.iView = view;
		iModel = new Model();
	}
	
	public void saveUser(int id, String firstName, String secondName) {
		iModel.setID(id);
		iModel.setFirstName(firstName);
		iModel.setSecondName(secondName);
		iModel.save(id, firstName, secondName);
	}
	
	public void loadUser(int id) {
		UserBean userBean = iModel.load(id);
		iView.setFirstName(userBean.getFirstName());
		iView.setSecondName(userBean.getSecondName());
	}
	
	

}

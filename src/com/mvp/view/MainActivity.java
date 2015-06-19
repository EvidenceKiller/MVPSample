package com.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.mvp.R;
import com.mvp.presenter.Presenter;

public class MainActivity extends Activity implements OnClickListener, InterfaceView {

	private EditText firstName, secondName, editText;
	private Button saveButton, loadButton;
	private Presenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findWidgets();
		presenter = new Presenter(this);
		saveButton.setOnClickListener(this);
		loadButton.setOnClickListener(this);

	}

	void findWidgets() {
		firstName = (EditText) findViewById(R.id.first_name_edt);
		secondName = (EditText) findViewById(R.id.last_name_edt);
		editText = (EditText) findViewById(R.id.id_edt);
		saveButton = (Button) findViewById(R.id.saveButton);
		loadButton = (Button) findViewById(R.id.loadButton);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mvp.view.InterfaceView#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return Integer.parseInt(editText.getText().toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mvp.view.InterfaceView#getFirstName()
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName.getText().toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mvp.view.InterfaceView#getSecondName()
	 */
	@Override
	public String getSecondName() {
		// TODO Auto-generated method stub
		return secondName.getText().toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mvp.view.InterfaceView#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName.setText(firstName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mvp.view.InterfaceView#setSecondName(java.lang.String)
	 */
	@Override
	public void setSecondName(String secondName) {
		// TODO Auto-generated method stub
		this.secondName.setText(secondName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.saveButton:
			presenter.saveUser(getID(), getFirstName(), getSecondName());
			break;
		case R.id.loadButton:
			presenter.loadUser(getID());
			break;
		default:
			break;
		}
	}

}

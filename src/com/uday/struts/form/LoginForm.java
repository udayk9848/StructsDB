package com.uday.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uName = null;
	private String pass = null;

	public String getUserName() {
		return uName;
	}

	public void setUserName(String userName) {
		this.uName = userName;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String password) {
		this.pass = password;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.pass = null;
	}

}

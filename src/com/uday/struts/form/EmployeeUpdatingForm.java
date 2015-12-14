
package com.uday.struts.form;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.uday.struts.dao.UserRegisterDAO;

public class EmployeeUpdatingForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String userName;
	private String ouserName;
	private String password;
	private String oPassword;
	private String email;
	private String phone;

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		HttpSession ses = request.getSession(true);
		String name=null;
		UserRegisterDAO dao=new UserRegisterDAO();
		name = dao.usernamevalidation(userName);
		System.out.println("before");
		String OuserName = ses.getAttribute("ouserName").toString();
		System.out.println("sfter");
		if (firstName == null || firstName.length() < 1) {
			errors.add("firstName", new ActionMessage(
					"error.firstName.required"));

		}
		if (lastName == null || lastName.length() < 1) {
			errors.add("lastName", new ActionMessage("error.lastName.required"));

		}
		if(userName.equalsIgnoreCase(name))
		{
			System.out.println("userName :"+userName);
			System.out.println("Name :"+name);
			System.out.println("olduserName :"+OuserName);
			if(userName.equalsIgnoreCase(OuserName)){
				
			}
			
				else {
			errors.add("userName", new ActionMessage("error.userName.exist"));
			}

		}
		if (userName == null || userName.length() < 1) {
			errors.add("userName", new ActionMessage("error.userName.required"));

		}
		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));

		}
		if (email == null || email.length() < 1) {
			errors.add("email", new ActionMessage("error.email.required"));

		}
		if (phone == null || phone.length() < 1) {
			errors.add("phone", new ActionMessage("error.phone.required"));

		}
		return errors;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOuserName() {
		return ouserName;
	}

	public void setOuserName(String ouserName) {
		ouserName = ouserName;
	}

	public String getOpassword() {
		return oPassword;
	}

	public void setOpassword(String opassword) {
		oPassword = opassword;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.userName = null;
		this.password = null;
		this.firstName = null;
		this.lastName = null;
		this.email = null;
		this.phone = null;
		this.oPassword=null;
		this.ouserName=null;
	}

}


package com.uday.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.uday.struts.dao.EmpPojo;
import com.uday.struts.dao.UserRegisterDAO;
import com.uday.struts.form.LoginForm;

public class UserRegisterAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession(true);

		/*
		 * UserRegisterForm registerForm = (UserRegisterForm) form; UserPojo
		 * pojo = new UserPojo(); pojo.firstName = registerForm.getFirstName();
		 * pojo.lastName= registerForm.getLastName(); pojo.userName =
		 * registerForm.getUserName(); pojo.password =
		 * registerForm.getPassword(); pojo.email = registerForm.getEmail();
		 * pojo.phone = registerForm.getPhone();
		 */
		/*
		 * HttpSession ses = request.getSession(true);
		 * 
		 * UserRegisterForm registerForm = (UserRegisterForm) form; String
		 * firstName = registerForm.getFirstName(); String lastName =
		 * registerForm.getLastName(); String userName =
		 * registerForm.getUserName(); String password =
		 * registerForm.getPassword(); String email = registerForm.getEmail();
		 * String phone = registerForm.getPhone(); UserRegisterDAO dao = new
		 * UserRegisterDAO(); dao.insertData(firstName, lastName, userName,
		 * password, email, phone); ses.setAttribute("firstName", firstName);
		 * ses.setAttribute("lastName", lastName); ses.setAttribute("userName",
		 * userName); ses.setAttribute("email", email);
		 * ses.setAttribute("phone", phone); if (firstName.equals("") ||
		 * lastName.equals("") || userName.equals("") || password.equals("") ||
		 * email.equals("") || phone.equals("")) { return
		 * mapping.findForward("error"); } return
		 * mapping.findForward("success");
		 */

		
		LoginForm loginForm = (LoginForm) form;
		String userName = loginForm.getUserName();
		String passWord = loginForm.getPassword();
		/*if ("uday".equalsIgnoreCase(loginForm.getUserName()) || loginForm.getPassword().equals("uday")) {
			if (loginForm.getUserName() == null || loginForm.getPassword() == null
					|| !loginForm.getUserName().equalsIgnoreCase("uday") || !loginForm.getPassword().equals("uday")) {
				return mapping.findForward("failure");
			} else {
				ses.setAttribute("userName", Username);
				return mapping.findForward("success");
			}
		}*/
		
		if (loginForm.getUserName() != null || loginForm.getPassword() != null){
			if("uday".equalsIgnoreCase(loginForm.getUserName()) && loginForm.getPassword().equals("uday")) 
			{
			session.setAttribute("userName", userName);	
			
			return mapping.findForward("success");
			}
			EmpPojo empPojo = new UserRegisterDAO().getEmployee(loginForm);
			if (empPojo.getEmail() == "notfound") {

				session.setAttribute("userName", userName);
				session.setAttribute("message", "User not found");
				
				return mapping.findForward("failureE");

			} else {
				session.setAttribute("firstName", empPojo.getFirstName());
				session.setAttribute("lastName", empPojo.getLastName());
				session.setAttribute("userName", userName);
				session.setAttribute("passWord", passWord);
				session.setAttribute("email", empPojo.getEmail());
				session.setAttribute("phone", empPojo.getPhone());
				session.setAttribute("message", "Employee Details");
				
				return mapping.findForward("successE");
			}
			
		 
		
		}
		
		/*if (!loginForm.getUserName().equalsIgnoreCase("uday") || !loginForm.getPassword().equals("uday")) {
			Emp = dao.EmpData1(userName, password);
			if (Emp.getEmail() == "notfound") {

				ses.setAttribute("userName", userName);

				ses.setAttribute("message", "User not found");
				return mapping.findForward("failureE");

			} else {
				ses.setAttribute("firstName", Emp.getFirstName());
				ses.setAttribute("lastName", Emp.getLastName());
				ses.setAttribute("userName", userName);
				ses.setAttribute("passWord", password);
				ses.setAttribute("email", Emp.getEmail());
				ses.setAttribute("phone", Emp.getPhone());
				ses.setAttribute("message", "Employee Details");
				return mapping.findForward("successE");
			}
		}*/
		return mapping.findForward("failure");

	}

}

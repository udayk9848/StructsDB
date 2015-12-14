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
import com.uday.struts.form.CreateForm;
import com.uday.struts.form.DeleteForm;
import com.uday.struts.form.SearchForm;
import com.uday.struts.form.UpdateForm;

public class SearchAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession ses = request.getSession(true);
 
        SearchForm registerForm = (SearchForm) form;
        EmpPojo Emp = new EmpPojo();
        String userName = registerForm.getUserName();
       /* String password = registerForm.getPassword();*/
  
        UserRegisterDAO dao = new UserRegisterDAO();
        Emp =dao.EmpData(userName);
        if(Emp.getEmail()=="notfound"){
        	
        	ses.setAttribute("userName", userName);
       	 
            ses.setAttribute("message", "User not found");
        	return mapping.findForward("failure");
       
        }
        else{
        	ses.setAttribute("firstName", Emp.getFirstName());
            ses.setAttribute("lastName", Emp.getLastName());
            ses.setAttribute("userName", userName);
            ses.setAttribute("passWord", Emp.getPassword());
            ses.setAttribute("email",Emp.getEmail());
            ses.setAttribute("phone", Emp.getPhone());
            ses.setAttribute("message", "User Details");
        	 return mapping.findForward("success");
        }
 
    }
}
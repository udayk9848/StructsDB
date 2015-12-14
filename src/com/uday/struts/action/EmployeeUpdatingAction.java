
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
import com.uday.struts.form.EmployeeUpdatingForm;
import com.uday.struts.form.UpdateForm;
import com.uday.struts.form.UpdatingForm;

public class EmployeeUpdatingAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	 if(getErrors(request) == null ||getErrors(request).size() == 0)
       	 {
            HttpSession ses = request.getSession(true);
     
            EmployeeUpdatingForm registerForm = (EmployeeUpdatingForm) form;
            String firstName = registerForm.getFirstName();
            String lastName = registerForm.getLastName();
            String userName = registerForm.getUserName();
            String OuserName = ses.getAttribute("ouserName").toString();
            String Opassword = ses.getAttribute("ouserName").toString();
           // String OuserName = registerForm.getOuserName();
            String password = registerForm.getPassword();
            //String Opassword = registerForm.getOpassword();
            String email = registerForm.getEmail();
            String phone = registerForm.getPhone();
            UserRegisterDAO dao = new UserRegisterDAO();
            dao.EupdateData(firstName, lastName, userName, password, email, phone,OuserName,Opassword);
            ses.setAttribute("firstName", firstName);
            ses.setAttribute("lastName", lastName);
            ses.setAttribute("userName", userName);
            ses.setAttribute("passWord", password);
            ses.setAttribute("email", email);
            ses.setAttribute("phone", phone);
            ses.setAttribute("message", "User updated successfully");
            
            return mapping.findForward("success");
       	 }
       	 else
       	        return mapping.getInputForward();
 
    }
}
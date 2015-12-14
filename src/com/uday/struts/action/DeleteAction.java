package com.uday.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.uday.struts.dao.UserRegisterDAO;
import com.uday.struts.form.CreateForm;
import com.uday.struts.form.DeleteForm;

public class DeleteAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession ses = request.getSession(true);
 
        DeleteForm registerForm = (DeleteForm) form;
    
        String userName = registerForm.getUserName();
       /* String password = registerForm.getPassword();*/
  
        UserRegisterDAO dao = new UserRegisterDAO();
        String Found=dao.deleteData(userName);
        if(Found=="found"){
        ses.setAttribute("userName", userName); 
        
        ses.setAttribute("message", "User Deleted successfully");
        
        return mapping.findForward("success");
        
        }
        else{
        	
        	ses.setAttribute("userName", userName);
        	 
            ses.setAttribute("message", "User not found");
        	return mapping.findForward("failure");
        }
 
    }
}

package com.uday.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.uday.struts.dao.EmpPojo;
import com.uday.struts.dao.UserRegisterDAO;
 
public class EmployeeManagementAction extends DispatchAction {
     
    public ActionForward create(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	  
    	 request.setAttribute("message", "User created successfully");
         
         return mapping.findForward("success");
       
    }
 
 
 
    public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
     
        request.setAttribute("message", "User deleted successfully");
         
        return mapping.findForward("successD");
    }
 
 
 
    public ActionForward update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
     
        request.setAttribute("message", "User updated successfully");
         
        return mapping.findForward("successU");
    }
    public ActionForward logout(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	HttpSession ses = request.getSession(true);
    	ses.removeAttribute("userName");
    	ses.invalidate();
        request.setAttribute("message", "User updated successfully");
         
        return mapping.findForward("successl");
    }
 
    
    
    
 
 
    public ActionForward search(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	HttpSession ses = request.getSession(true);
    	EmpPojo emp=new EmpPojo();
    	ArrayList<EmpPojo> list=new ArrayList<EmpPojo>();
    	UserRegisterDAO dao = new UserRegisterDAO();
    	list=dao.Search();
    	request.setAttribute("message", " In Search block");
    	ses.setAttribute("list", list);
         
        return mapping.findForward("successB");
    }
}
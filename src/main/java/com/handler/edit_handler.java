package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_bo.add_bo;
import student_dao.student_dao;
/**
 * Servlet implementation class edit_handler
 */
@WebServlet("/edit_handler")
public class edit_handler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit_handler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 response.setContentType("text/html");
			
			PrintWriter pw=response.getWriter();
			
			   String id=request.getParameter("id");
	           
			      
			   
			    
			      add_bo eb= student_dao.getEmployeeById(id);
			    
			      pw.print("<body style=\"background-color: rgb(229 208 217 / 18%); backdrop-filter: blur(1px);\">");
					pw.print("<centre><div style=\"border: solid 2px;     background-color: #2dcaf912;color: #c7b0e3; height: fit-content;width: fit-content;margin-left: 300px;margin-top: 100px; border-radius: 20px;padding: 20px;\">");
				
					
					
				pw.print("<form  action='update_handler' method='get'> ");
			    
				 pw.print("<h1 style=\"color: #991be0;padding-left: 100px;\">DATA </h1>");
				 
				pw.print("<table>");
				
				pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
				pw.print("<tr><td>Name: </td> <td><input type='text' name='name' value='"+eb.getName()+"'/></td></tr>");
			   	pw.print("<tr><td>Email: </td> <td><input type='text' name='email' value='"+eb.getEmail()+"'/></td></tr>");
			   	pw.print("<tr><td>Phone:</td> <td><input type='text' name='phone' value='"+eb.getPhone()+"'/></td></tr>");
			   	pw.print("<tr><td>Date of Joining : </td> <td><input type='text' name='doj' value='"+eb.getDoj()+"'/></td></tr>");
			   	pw.print("<tr><td>Date of Birth: </td> <td><input type='text' name='dob' value='"+eb.getEoj()+"'/></td></tr>");
			   	pw.print("<tr><td>Adhar Card: </td> <td><input type='text' name='adhar' value='"+eb.getAdhar()+"'/></td></tr>");
				
			   	
			   
			    
			   	pw.print("</table>");
			    pw.print("<br><input type='submit' value='Update' style=\"background-color: #5fdd2d9c;border-radius: 10px;font-size: 20px; \">"); 
			    
				pw.print("</form>");
			
				 pw.print("</body>");
	}

}

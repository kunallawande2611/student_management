package com.handler;

import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_bo.add_bo;
import student_dao.student_dao;
/**
 * Servlet implementation class all_emp_controller
 */
@WebServlet("/all_emp_controller")
public class all_emp_controller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public all_emp_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		

	       
	        
		response.setContentType("text/html");
		PrintWriter  pw=response.getWriter();
		
		
		pw.print("<a href='homepage.html'>Back</a>");
		
		
	
	
		
	  pw.print("<body style=\"background-color: rgb(229 208 217 / 18%); backdrop-filter: blur(1px);\">");
		pw.print("<centre><div style=\"border: solid 2px; background-color: #2dcaf912;color: #c7b0e3; height: fit-content;width: fit-content;margin-left: 250px;margin-top: 100px;border-radius: 20px;padding: 20px;\">");
		pw.print("<table border='1px' width='1000px'> ");
	    
	    pw.print("<tr> <th>ID </th><th> Name </th> <th> Email </th> <th> Phone </th> <th> Date Of Joining </th> <th>Birth Date </th> <th> Aadhaar</th>  <th> Delete</th><th>Update</th></tr>");
		
	    List<add_bo> list= student_dao.get_all_employee();
		   
	    pw.print("<h1 style=\"color: #991be0;padding-left: 450px;\">DATA </h1>");
	    
		  for(add_bo eb:list) 
		  {
			  
			   pw.print("<tr><td>"+eb.getId()+"</td><td>"+eb.getName()+"</td><td>"+eb.getEmail()+"</td><td>"+eb.getPhone()+"</td><td>"+eb.getDoj()+"</td><td>"+eb.getEoj()+"</td><td>"+eb.getAdhar()+"</td><td><a href='delete_handler?id="+eb.getId()+"'>delete </a> </td><td><a href='edit_handler?id="+eb.getId()+"'>Edit </a> </td></tr>"); 
		  }
		   
		  pw.print("</table>");
		  
		 // <td><a href='DeleteServlet?id="+eb.getId()+"'>delete </a></td>
		  
		  pw.print("</body>");
	}

}

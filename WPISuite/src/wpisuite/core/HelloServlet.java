package wpisuite.core;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

import wpisuite.models.*;
public class HelloServlet extends HttpServlet 
{

	public void doGet (HttpServletRequest req,
                       HttpServletResponse res) throws ServletException, IOException
	{
		User steve = new User("steve", 1);
	        PrintWriter out = res.getWriter();
	        out.println("HELLO WORLD!");
	        out.close();
	}
}
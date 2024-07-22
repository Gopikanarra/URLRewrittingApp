import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String num=request.getParameter("num");
	String quant=request.getParameter("quant");
	
	HttpSession session=request.getSession();
	Object name=session.getAttribute("name");
	Object age=session.getAttribute("age");
	Object add=session.getAttribute("add");
	
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.print("<body bgcolor:'cyan'>");
	pw.print("<center>");
	pw.print("<table border='1'>");
	pw.print("<tr><th>Name</th><td>"+name+"</td></tr>");
	pw.print("<tr><th>age</th><td>"+age+"</td></tr>");
	pw.print("<tr><th>address</th><td>"+add+"</td></tr>");
	pw.print("<tr><th>Number</th><td>"+num+"</td></tr>");
	pw.print("<tr><th>quantity</th><td>"+quant+"</td></tr>");
	pw.print("</table></center></body>");
	pw.close();
		}

}

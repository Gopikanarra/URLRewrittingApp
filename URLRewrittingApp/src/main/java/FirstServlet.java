

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collect the inputs from the request object
		
		String name=request.getParameter("sname");
		String age=request.getParameter("sage");
		String add=request.getParameter("sadd");
	
		HttpSession session=request.getSession();
		session.setAttribute("name",name);
		session.setAttribute("age",age);
		session.setAttribute("add",add);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.print("<body bgcolor='lightyellow'>");
		pw.print("<center>");
		pw.print("<form method='get' action='"+response.encodeURL("./SecondServlet")+"'>");
		pw.print("<table>");
		pw.print("<tr><th>item no:</th><td><input type='text' name='num'/></td></tr>");
		pw.print("<tr><th>item quantity</th><td><input type='text' name='quant'/></td></tr>");
		pw.print("<tr><th></th><td><input type='submit' value='Next'/></td></tr>");
		pw.print("</table>");
		pw.print("</form>");
		pw.print("</center>");
		pw.print("</body>");
	
	pw.close();
	}

}

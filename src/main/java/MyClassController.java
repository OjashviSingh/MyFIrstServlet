import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/home")
public class MyClassController extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");

		if (email.contentEquals("Ojashvi@gmail.com") && password.contentEquals("0123456")) {
			pw.println("<h2>Login Succesfull</h2>");
		} else {
			pw.println("<h2>Login Failed</h2>");
		}

		pw.println("<a href=\"index.jsp\"><button type=\"button\">Home</button></a>");
		pw.close();

	}

}
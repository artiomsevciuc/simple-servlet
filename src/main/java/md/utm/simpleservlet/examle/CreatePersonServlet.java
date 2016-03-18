package md.utm.simpleservlet.examle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreatePersonServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String dateOfBirth = req.getParameter("dateOfBirth");
		String isStudent = req.getParameter("isStudent");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Result of person creation";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(
				docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
						+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n" + "  <li><b>Name: </b> " + name + "\n"
						+ "  <li><b>Surname: </b> " + surname + "\n" + "  <li><b>Date of firth </b>: " + dateOfBirth
						+ "\n" + "  <li><b>Is student </b>: " + isStudent + "\n" + "</ul>" + "\n" + "</body></html>");
	}
}

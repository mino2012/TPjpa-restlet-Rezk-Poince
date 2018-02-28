package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDAO;
import domain.Person;

@WebServlet(name="userinfo",
urlPatterns={"/UserInfo"})
public class UserInfo extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException {response.setContentType("text/html");
		
	PersonDAO dao = new PersonDAO();
	Person p = new Person(request.getParameter("name") , request.getParameter("firstname"),request.getParameter("mail"));
	/*p.setNom(request.getParameter("name") );
	p.setPrenom(request.getParameter("firstname"));
	p.setMail(request.getParameter("mail"));*/
	
	dao.addPerson(p);
	
	PrintWriter out = response.getWriter();
	out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>\n" +			
		" <LI>Nom: "
				+ request.getParameter("name") + "\n" +
				" <LI>Prenom: "
				+ request.getParameter("firstname") + "\n" +
				" <LI>Mail: "
				+ request.getParameter("mail") + "\n" +
				"</UL>\n" +				
		"</BODY></HTML>");
	
}
}

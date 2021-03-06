import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Date", urlPatterns = { "/date" })
public class Date extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Date() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/date.jsp");
		dispatcher.forward(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
	}

}

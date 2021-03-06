import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Dest", urlPatterns = { "/dest" })
public class Dest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Dest() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/dest.jsp");
		dispatcher.forward(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
	}

}

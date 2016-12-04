import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Redirect", urlPatterns = { "/redirect" })
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Redirect() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		String url = "/myapp/dest";
                res.sendRedirect(url);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
	}

}

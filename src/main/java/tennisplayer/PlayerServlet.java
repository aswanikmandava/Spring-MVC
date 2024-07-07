package tennisplayer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		PrintWriter writer = res.getWriter();
//		writer.println("<html>");
//		writer.println("<head>" +
//					   "<title>Player DB</title>" +
//					   "</head>");
//		writer.println("<body>" +
//				       "<H2>Welcome to the Tennis Players database!</H2>" +
//					   "</body>");
//		writer.println("</html>");
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
}

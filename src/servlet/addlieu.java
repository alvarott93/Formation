package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LieuDao;
import model.Lieu;

/**
 * Servlet implementation class addlieu
 */
@WebServlet("/addlieu")
public class addlieu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addlieu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get addlieu");
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/addlieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entro doPost addLieu");
		Lieu lieu=new Lieu();
		lieu.setAdresse(request.getParameter("adresse"));
		lieu.setVille(request.getParameter("ville"));
		LieuDao lieudao = new LieuDao();
		lieudao.ajoutLieu(lieu);
		request.setAttribute("message", "Lieu has been created succesfully");
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/index.jsp").forward(request, response);
	}

}

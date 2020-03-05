package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FormationDao;
import DAO.ILieuDao;
import DAO.LieuDao;
import model.Formation;
import model.Lieu;


/**
 * Servlet implementation class listforma
 */
@WebServlet("/listforma")
public class listforma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listforma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get listeformations");
		List<Lieu> list= new ArrayList<>();
		ILieuDao lieudao= new LieuDao();
		list=lieudao.listeLieu();
		System.out.println("liste de lieus addforma");
		System.out.println(list);
		request.setAttribute("list", list);
       this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/listeformation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormationDao daofor= new FormationDao();
		String vi=request.getParameter("vi");
		List<Formation> list=daofor.listerFormparlieu(vi);
		request.setAttribute("list", list);
		request.setAttribute("message", vi);
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/listeformationlieu.jsp").forward(request, response);
	}

}

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
 * Servlet implementation class addforma
 */
@WebServlet("/addforma")
public class addforma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addforma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get addformation");
		List<Lieu> list= new ArrayList<>();
		ILieuDao lieudao= new LieuDao();
		list=lieudao.listeLieu();
		System.out.println("liste de lieus addforma");
		System.out.println(list);
		request.setAttribute("list", list);
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/addformation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post addformation");
		Formation forma=new Formation();
		forma.setTheme(request.getParameter("descrip"));
		FormationDao daoform = new FormationDao();
		Lieu lieu= new Lieu();
		lieu.setIdLieu(Integer.parseInt(request.getParameter("idl")));
		forma.setLieu(lieu);
		System.out.println("formation is going to be created");
		daoform.ajoutForm(forma);
		request.setAttribute("message", "Formation has been created succesfully");
		System.out.println("formation created with place");
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/index.jsp").forward(request, response);
		
	}

}

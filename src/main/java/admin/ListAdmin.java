package admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import danhmuc.danhmuc;
import danhmuc.danhmuc_dao;

/**
 * Servlet implementation class ListAdmin
 */
@WebServlet("/ListAdmin")
public class ListAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

danhmuc_dao dao = new danhmuc_dao();
ArrayList<danhmuc> list = new ArrayList<danhmuc>();




try {
	list=dao.getAll();
	getServletContext().setAttribute("danhmuc", list);
	request.getRequestDispatcher("Admin_web.jsp").forward(request, response);
	
	
	
} catch (Exception e) {
	System.out.println(e);
}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

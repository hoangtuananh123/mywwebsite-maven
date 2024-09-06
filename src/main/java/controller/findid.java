package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sanpham.sanpham;
import sanpham.sanpham_dao;

/**
 * Servlet implementation class findid
 */
@WebServlet("/findid")
public class findid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		sanpham_dao dao = new sanpham_dao();
		int chuyen= Integer.parseInt(id);
		sanpham sp = new sanpham(chuyen);
		
		ArrayList<sanpham> listsp= new ArrayList<sanpham>();
		ArrayList<sanpham> listsps= new ArrayList<sanpham>();
		
		try {
			listsps = dao.getAll();
			listsp= dao.getId(sp);
		getServletContext().setAttribute("data_sp", listsp);
		getServletContext().setAttribute("data_sps", listsps);
		request.getRequestDispatcher("sanpham.jsp").forward(request, response);
		
		
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

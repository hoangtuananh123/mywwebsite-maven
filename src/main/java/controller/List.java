package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import danhmuc.danhmuc;
import danhmuc.danhmuc_dao;
import dathangqb.dathangqb;
import dathangqb.dathangqb_dao;
import quangba.quangba_dao;
import quangba.quangbasp;
import sanpham.sanpham;
import sanpham.sanpham_dao;

/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		danhmuc_dao  dm =  new danhmuc_dao();
		sanpham_dao sp = new sanpham_dao();
		ArrayList<danhmuc> danhmuc= new ArrayList<danhmuc>();
		ArrayList<sanpham> sanpham = new ArrayList<sanpham>();
		ArrayList<dathangqb> lists= new ArrayList<dathangqb>();
		quangba_dao qb = new quangba_dao();
		dathangqb_dao dao = new dathangqb_dao();
		ArrayList<quangbasp> listsp= new ArrayList<quangbasp>();
		try {
			lists= dao.getAll();
			getServletContext().setAttribute("dataas", lists);
			sanpham=sp.getAll();
			danhmuc=dm.getAll();
			listsp= qb.getAll();
			getServletContext().setAttribute("list", listsp);
			getServletContext().setAttribute("data", sanpham);
			getServletContext().setAttribute("danhmuc", danhmuc);
			
			request.getRequestDispatcher("xuly.jsp").forward(request, response);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}

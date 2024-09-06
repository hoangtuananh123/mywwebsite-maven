package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dathangqb.dathangqb;
import dathangqb.dathangqb_dao;

/**
 * Servlet implementation class xulydathangqb
 */
@WebServlet("/xulydathangqb")
public class xulydathangqb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xulydathangqb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String hoten= request.getParameter("namenew");
		String sdt= request.getParameter("sodienthoai");
		String diachi= request.getParameter("diachi");
		
		dathangqb dh = new dathangqb(hoten, sdt, diachi);
		dathangqb_dao dao = new dathangqb_dao();
		
	ArrayList<dathangqb> lists= new ArrayList<dathangqb>();
	try {
		dao.insert(dh);
		
		response.sendRedirect("List");
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

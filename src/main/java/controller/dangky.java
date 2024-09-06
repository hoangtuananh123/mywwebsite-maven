package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nguoidung.nguoidung;
import nguoidung.nguoidung_dao;

/**
 * Servlet implementation class dangky
 */
@WebServlet("/dangky")
public class dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangky() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String hoten = request.getParameter("hoten");
		String pass = request.getParameter("pass");
		String againpass = request.getParameter("againpass");
		
		nguoidung_dao dao = new nguoidung_dao();
		
		
			if(pass.equals(againpass)) {
				System.out.println("asdnmkbvaskndasjkbd");
				
				try {	
					nguoidung nd  = new nguoidung(email,pass,hoten,"","");
					dao.insert(nd);
					
					response.sendRedirect("List");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				
			}
	
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}

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
 * Servlet implementation class danhmuc_new
 */
@WebServlet("/danhmuc_new")
public class danhmuc_new extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public danhmuc_new() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		
//		String id = request.getParameter("id");
//		String ten = request.getParameter("ten");
//		String xuatxu = request.getParameter("xx");
//		danhmuc dm = new danhmuc(id, ten, xuatxu);
//		danhmuc_dao dao= new danhmuc_dao();
//
//
//		String idu = request.getParameter("id");
//		String tenu = request.getParameter("ten");
//		String xuatxuu = request.getParameter("mota");
//		danhmuc dmu = new danhmuc(id, ten, xuatxu);
//		danhmuc_dao daou= new danhmuc_dao();
//
//
//
//
//		try {
//			
//			if (id == null || id.isEmpty()) {
//				
//				dao.insert(dm);
//			} else {
//			
//				dao.update(dmu);
//			}
//			response.sendRedirect("ListAdmin");
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}


		String id = request.getParameter("id");
		String ten = request.getParameter("ten");
		String xuatxu = request.getParameter("xx");

		danhmuc_dao dao = new danhmuc_dao();
		danhmuc dm = new danhmuc(id, ten, xuatxu);
		

		try {
			  ArrayList<danhmuc> existingDm = dao.getId(dm);
	            if (existingDm.isEmpty()) {
				dao.insert(dm);
				
			} else {
				dao.update(dm);
			}
			response.sendRedirect("ListAdmin");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

		
		
		
		
		
		
		
	

}

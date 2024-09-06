package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import danhmuc.danhmuc;
import danhmuc.danhmuc_dao;
import nguoidung.nguoidung;
import nguoidung.nguoidung_dao;
import sanpham.sanpham;
import sanpham.sanpham_dao;

@WebServlet("/dangnhap")
public class dangnhap extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private nguoidung_dao nguoidungDAO;

    public void init() {
        nguoidungDAO = new nguoidung_dao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
    	danhmuc_dao  dm =  new danhmuc_dao();
		sanpham_dao sp = new sanpham_dao();
		ArrayList<danhmuc> danhmuc= new ArrayList<danhmuc>();
		ArrayList<sanpham> sanpham = new ArrayList<sanpham>();
		
			
        nguoidung user = null;
        try {
            ArrayList<nguoidung> users = nguoidungDAO.getAll();
            for (nguoidung u : users) {
                if (u.getEmail().equals(email) && u.getMatkhau().equals(pass)) {
                    user = u;
                    break;
                }
            }
            sanpham=sp.getAll();
			danhmuc=dm.getAll();
			
			
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (user != null) {
        	getServletContext().setAttribute("data", sanpham);
			getServletContext().setAttribute("danhmuc", danhmuc);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            
            response.sendRedirect("xulyok.jsp");
        } else {
            response.sendRedirect("dangnhap.html");
        }
    }
}

package giohang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import giohang.giohang;
import kn.DAO_web;
import kn.connection;

public class giohang_dao implements DAO_web<giohang> {
	private  String all ="select *from giohang";
	private String insert="insert into giohang(idnguoidung,tonggia) values (?,?)";
	private String update="update giohang set idnguoidung =?, tonggia=? where idgio=?";
	private String delete="delete from giohang where idgio=?";
	private String search_id="select *from giohang where idgiohang=? or idnguoidung=?";
//	private String search_name="";

	@Override
	public ArrayList<giohang> getAll() throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<giohang> gh = new ArrayList<giohang>();
		 if(con!=null) {
			 pr= con.prepareStatement(all);
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 giohang danh= new giohang(rs.getInt(1), rs.getInt(2), rs.getFloat(3));
			 System.out.println(danh.toString());
			 gh.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return gh;
	}

	@Override
	public void insert(giohang t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr= con.prepareStatement(insert);
			pr.setInt(1, t.getIdnguoidung());
			pr.setFloat(2, t.getTonggia());
			
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public void update(giohang t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(update);
			pr.setInt(1, t.getIdnguoidung());
			pr.setFloat(2, t.getTonggia());
			pr.setInt(3, t.getIdgio());
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public void delete(giohang t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(delete);
		
			pr.setInt(1,t.getIdgio());
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public ArrayList<giohang> getName(giohang t) throws SQLException {
		ArrayList<giohang> nf = new ArrayList<giohang>();
		System.out.println("khong dung");
		return nf;
	}

	@Override
	public ArrayList<giohang> getId(giohang t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<giohang> gh = new ArrayList<giohang>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_id);
			 pr.setInt(1, t.getIdgio());
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 giohang danh= new giohang(rs.getInt(1), rs.getInt(2), rs.getFloat(3));
			 System.out.println(danh.toString());
			 gh.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return gh;
	}
}

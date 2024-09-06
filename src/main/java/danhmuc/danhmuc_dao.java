package danhmuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kn.DAO_web;
import kn.connection;

public class danhmuc_dao implements DAO_web<danhmuc> {
	private  String all ="select *from danhmuc";
	private String insert="insert into danhmuc(iddanhmuc,tendanhmuc,mota) values (?,?,?)";
	private String update="update danhmuc set tendanhmuc =?, mota=? where iddanhmuc=?";
	private String delete="delete from danhmuc where iddanhmuc=?";
	private String search_id="select *from danhmuc where iddanhmuc=?";
	private String search_name="select *from danhmuc where tendanhmuc=?";

	@Override
	public ArrayList<danhmuc> getAll() throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<danhmuc> dm = new ArrayList<danhmuc>();
		 if(con!=null) {
			 pr= con.prepareStatement(all);
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 danhmuc danh= new danhmuc(rs.getString(1), rs.getString(2), rs.getString(3));
			 System.out.println(danh.toString());
			 dm.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return dm;
	}

	@Override
	public void insert(danhmuc t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr= con.prepareStatement(insert);
			pr.setString(1, t.getIddanhmuc());
			pr.setString(2, t.getTendanhmuc());
			pr.setString(3, t.getMota());
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public void update(danhmuc t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(update);
			pr.setString(1, t.getTendanhmuc());
			pr.setString(2,  t.getMota());
			pr.setString(3,t.getIddanhmuc());
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public void delete(danhmuc t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(delete);
		
			pr.setString(1,t.getIddanhmuc());
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public ArrayList<danhmuc> getName(danhmuc t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<danhmuc> dm = new ArrayList<danhmuc>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_name);
			 pr.setString(1, t.getTendanhmuc());
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 danhmuc danh= new danhmuc(rs.getString(1), rs.getString(2), rs.getString(3));
//			 System.out.println(danh.toString());
			 dm.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return dm;
	}

	@Override
	public ArrayList<danhmuc> getId(danhmuc t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<danhmuc> dm = new ArrayList<danhmuc>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_id);
			 pr.setString(1, t.getIddanhmuc());
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 danhmuc danh= new danhmuc(rs.getString(1), rs.getString(2), rs.getString(3));
			 System.out.println(danh.toString());
			 dm.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return dm;
	}
//	public static void main(String[] args) {
//		danhmuc d = new danhmuc("ip","iphone","Apple");
//		danhmuc d2 = new danhmuc("ss","","");
//		danhmuc d3 = new danhmuc("ip","ipad","apple");
//		danhmuc_dao f = new danhmuc_dao();
//	try {
//		f.delete(d2);
////		f.delete(d3);
//		System.out.println(f.getAll());
//		
//		
//		
//		
//		System.out.println("ok");
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	}

}

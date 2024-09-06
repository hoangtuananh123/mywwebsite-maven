package dathangqb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kn.DAO_web;
import dathangqb.dathangqb;

public class dathangqb_dao  implements DAO_web<dathangqb>{
	private  String all ="select *from dathangqb";
	private String insert="insert into dathangqb(namenew,sodienthoai,diachi) values (?,?,?)";
	private String update="update dathangqb set namenew=?, sodienthoai=?,diachi=? where idkhachhang =? ";
	private String delete="delete from dathangqb where idkhachhang=?";
	private String search_id="select *from dathangqb where idkhachhang=?";
	private String search_name="select *from dathangqb where namenew=?";

	@Override
	public ArrayList<dathangqb> getAll() throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<dathangqb> nd = new ArrayList<dathangqb>();
		 if(con!=null) {
			 pr= con.prepareStatement(all);
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 dathangqb danh= new dathangqb(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
			 System.out.println(danh.toString());
			 nd.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return nd;
	}

	@Override
	public void insert(dathangqb t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(insert);
			pr.setString(1,  t.getNamenew());
			pr.setString(2,t.getSodienthoai());
			pr.setString(3,t.getDiachi());
		
			
		
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public void update(dathangqb t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(update);
			pr.setString(1,  t.getNamenew());
			pr.setString(2,t.getSodienthoai());
			pr.setString(3,t.getDiachi());
			pr.setInt(4, t.getIdkhachhang());
			
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public void delete(dathangqb t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(delete);	
			pr.setInt(1, t.getIdkhachhang());
			
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public ArrayList<dathangqb> getName(dathangqb t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<dathangqb> nd = new ArrayList<dathangqb>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_name);
			 pr.setString(1, t.getNamenew());
			
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 dathangqb danh= new dathangqb(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));

			 System.out.println(danh.toString());
			 nd.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return nd;
	}

	@Override
	public ArrayList<dathangqb> getId(dathangqb t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<dathangqb> nd = new ArrayList<dathangqb>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_id);
			pr.setInt(1, t.getIdkhachhang());
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 dathangqb danh= new dathangqb(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
			 System.out.println(danh.toString());
			 nd.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return nd;
	}
	
//	public static void main(String[] args) {
//		
//		dathangqb_dao dao = new dathangqb_dao();
//		dathangqb dh = new dathangqb(1,"aaaaaaaaaaa","asdasd","asdasdas");
//		
//		
//		
//		
//		try {
////			dao.insert(dh);
//			dao.delete(dh);
//			
//			dao.getId(dh);
//			dao.getName(dh);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		
//	
//		
//	}
	
	
}
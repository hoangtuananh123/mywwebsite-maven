package nguoidung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import nguoidung.nguoidung;
import kn.DAO_web;

public class nguoidung_dao  implements DAO_web<nguoidung>{
	private  String all ="select *from nguoidung";
	private String insert="insert into nguoidung(email,matkhau,hoten,sdt,diachi) values (?,?,?,?,?)";
	private String update="update nguoidung set matkhau=?, hoten=?,sdt=?,diachi=? where idnguoidung=? or email=? ";
	private String delete="delete from nguoidung where  idnguoidung=? or email=? ";
	private String search_id="select *from nguoidung where idnguoidung=? or email=?";
	private String search_name="select *from nguoidung where hoten=? or email=?";

	@Override
	public ArrayList<nguoidung> getAll() throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<nguoidung> nd = new ArrayList<nguoidung>();
		 if(con!=null) {
			 pr= con.prepareStatement(all);
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 nguoidung danh= new nguoidung(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
			 System.out.println(danh.toString());
			 nd.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return nd;
	}

	@Override
	public void insert(nguoidung t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(insert);
			pr.setString(1,  t.getEmail());
			pr.setString(2,t.getMatkhau());
			pr.setString(3,t.getHoten());
			pr.setString(4,t.getSdt());
			pr.setString(5,t.getDiachi());
			
		
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public void update(nguoidung t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(update);
			pr.setString(1,t.getMatkhau());
			pr.setString(2,t.getHoten());
			pr.setString(3,t.getSdt());
			pr.setString(4,t.getDiachi());
			pr.setInt(5, t.getIdnguoidung());
			pr.setString(6,  t.getEmail());
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public void delete(nguoidung t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr = con.prepareStatement(delete);
		
			pr.setInt(1,t.getIdnguoidung());
			pr.setString(2, t.getEmail());
			pr.executeUpdate();
		}
		
		 pr.close();
		 con.close();	
		
	}

	@Override
	public ArrayList<nguoidung> getName(nguoidung t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<nguoidung> nd = new ArrayList<nguoidung>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_name);
			 pr.setString(1, t.getHoten());
				pr.setString(2, t.getEmail());
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 nguoidung danh= new nguoidung(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
			 System.out.println(danh.toString());
			 nd.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return nd;
	}

	@Override
	public ArrayList<nguoidung> getId(nguoidung t) throws SQLException {
		 Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<nguoidung> nd = new ArrayList<nguoidung>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_id);
			 pr.setInt(1,t.getIdnguoidung());
				pr.setString(2, t.getEmail());
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 nguoidung danh= new nguoidung(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
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
//		nguoidung n1 = new nguoidung("anh","1234","tuananh","0395148600","thai nguyen");
//		nguoidung n2 = new nguoidung("anh","1234","tuananhhh","0395148600","thai nguyen");
//		nguoidung n3 = new nguoidung("anh","1234","tuananh","0395148600","thai nguyen");
//		nguoidung n4 = new nguoidung("anh","1234","tuananh","0395148600","thai nguyen");
//		nguoidung n5 = new nguoidung("anh","12345","tuanan","0395148600s","thai nguyesn");
//		nguoidung_dao f = new nguoidung_dao();
//		try {
////			f.insert(n1);
////			f.update(n5);
//			f.delete(n5);
//			
//			
////			f.getId(n2);
//			f.getAll();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	
//	
}

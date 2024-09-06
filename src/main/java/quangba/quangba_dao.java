package quangba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kn.DAO_web;
import quangba.quangbasp;

public class quangba_dao   implements DAO_web<quangbasp> {

	 private String all = "SELECT * FROM quangbasp";
	    private String insert = "INSERT INTO quangbasp (tensp, gia, thietke, chatlieu, kichthuoc, khoiluong, ngayramat, soCamera, soSIM, dungluongpin, "
	    		+ "kichthuocman, chip, chansac, hotrosac, image_home, image_home2, image_home3, image_banner, image_quangba1, image_quangba2, image_quangba3,"
	    		+ " image_quangba4, giamgia, hangsx, thoigianketthuc, iddanhmuc,bonho,ram,baohanh,dophangiaiCamera,soluong)"
	    		+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?)";
	    private String update = "UPDATE quangbasp SET tensp = ?, gia = ?, thietke = ?, chatlieu = ?, kichthuoc = ?, khoiluong = ?, ngayramat = ?, soCamera = ?, soSIM = ?, dungluongpin = ?, kichthuocman = ?, chip = ?, chansac = ?, hotrosac = ?, image_home = ?, image_home2 = ?, image_home3 = ?, image_banner = ?, image_quangba1 = ?, image_quangba2 = ?, image_quangba3 = ?, image_quangba4 = ?, giamgia = ?, hangsx = ?, thoigianketthuc = ?, iddanhmuc = ?,bonho=?,ram=?,baohanh=?,dophangiaiCamera=?,soluong=? WHERE idsanpham = ?";
	    private String delete = "DELETE FROM quangbasp WHERE idsanpham = ?";
	    private String search_id = "SELECT * FROM quangbasp WHERE idsanpham = ?";
	    private String search_name = "SELECT * FROM quangbasp WHERE tensp = ?";

	@Override
	public ArrayList<quangbasp> getAll() throws SQLException {
		Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<quangbasp> sp = new ArrayList<quangbasp>();
		 if(con!=null) {
			 pr= con.prepareStatement(all);
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 quangbasp danh = new quangbasp(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getDouble(24), rs.getString(25), rs.getString(26), rs.getString(27),rs.getInt(28),rs.getInt(29),rs.getString(30),rs.getString(31),rs.getInt(32));
			 System.out.println(danh.toString());
			 sp.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return sp;
	}

	@Override
	public void insert(quangbasp t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr= con.prepareStatement(insert);
			pr.setString(1, t.getTensp());
			pr.setDouble(2, t.getGia());
			pr.setString(3, t.getThietke());
			pr.setString(4, t.getChatlieu());
			pr.setString(5, t.getKichthuoc());
			pr.setDouble(6, t.getKhoiluong());
			pr.setString(7, t.getNgayramat());
			pr.setInt(8, t.getSoCamera());
			pr.setInt(9, t.getSoSIM());
			pr.setInt(10, t.getDungluongpin());
			pr.setString(11, t.getKichthuocman());
			pr.setString(12, t.getChip());	
			pr.setString(13, t.getChansac());
			pr.setString(14, t.getHotrosac());
			pr.setString(15, t.getImage_home());
			pr.setString(16,  t.getImage_home2());	
			pr.setString(17,  t.getImage_home3());
			pr.setString(18, t.getImage_banner());
			pr.setString(19, t.getImage_quangba1());
			pr.setString(20, t.getImage_quangba2());
			pr.setString(21, t.getImage_quangba3());
			pr.setString(22, t.getImage_quangba4());
			pr.setDouble(23, t.getGiamgia());
			pr.setString(24, t.getHangsx());
			pr.setString(25, t.getThoigianketthuc());
			pr.setString(26, t.getIddanhmuc());
			pr.setInt(27, t.getBonho());
			pr.setInt(28, t.getRam());
			pr.setString(29, t.getBaohanh());
			pr.setString(30, t.getDophangiaiCamera());
			pr.setInt(31, t.getSoluong());
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public void update(quangbasp t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr= con.prepareStatement(update);
			pr.setString(1, t.getTensp());
			pr.setDouble(2, t.getGia());
			pr.setString(3, t.getThietke());
			pr.setString(4, t.getChatlieu());
			pr.setString(5, t.getKichthuoc());
			pr.setDouble(6, t.getKhoiluong());
			pr.setString(7, t.getNgayramat());
			pr.setInt(8, t.getSoCamera());
			pr.setInt(9, t.getSoSIM());
			pr.setInt(10, t.getDungluongpin());
			pr.setString(11, t.getKichthuocman());
			pr.setString(12, t.getChip());	
			pr.setString(13, t.getChansac());
			pr.setString(14, t.getHotrosac());
			pr.setString(15, t.getImage_home());
			pr.setString(16,  t.getImage_home2());	
			pr.setString(17,  t.getImage_home3());
			pr.setString(18, t.getImage_banner());
			pr.setString(19, t.getImage_quangba1());
			pr.setString(20, t.getImage_quangba2());
			pr.setString(21, t.getImage_quangba3());
			pr.setString(22, t.getImage_quangba4());
			pr.setDouble(23, t.getGiamgia());
			pr.setString(24, t.getHangsx());
			pr.setString(25, t.getThoigianketthuc());
			pr.setString(26, t.getIddanhmuc());
			
			pr.setInt(27, t.getBonho());
			pr.setInt(28, t.getRam());
			pr.setString(29, t.getBaohanh());
			pr.setString(30, t.getDophangiaiCamera());
			pr.setInt(31, t.getSoluong());
			pr.setInt(32, t.getIdsanpham());
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
		
	}

	@Override
	public void delete(quangbasp t) throws SQLException {
		Connection con = kn.connection.getconnection();
		PreparedStatement pr = null;
		if(con!=null) {
			pr= con.prepareStatement(delete);
		
			pr.setInt(1, t.getIdsanpham());
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public ArrayList<quangbasp> getName(quangbasp t) throws SQLException {
		Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<quangbasp> sp = new ArrayList<quangbasp>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_name);
			 pr.setString(1, t.getTensp());
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 quangbasp danh = new quangbasp(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getDouble(24), rs.getString(25), rs.getString(26), rs.getString(27),rs.getInt(28),rs.getInt(29),rs.getString(30),rs.getString(31),rs.getInt(32));
			 System.out.println(danh.toString());
			 sp.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return sp;
	}

	@Override
	public ArrayList<quangbasp> getId(quangbasp t) throws SQLException {
		Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<quangbasp> sp = new ArrayList<quangbasp>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_id);
			 pr.setInt(1, t.getIdsanpham());
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 quangbasp danh = new quangbasp(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getDouble(24), rs.getString(25), rs.getString(26), rs.getString(27),rs.getInt(28),rs.getInt(29),rs.getString(30),rs.getString(31),rs.getInt(32));
			 System.out.println(danh.toString());
			 sp.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return sp;
	}



}

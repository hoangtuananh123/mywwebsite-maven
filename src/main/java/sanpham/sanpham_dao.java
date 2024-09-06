package sanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import danhmuc.danhmuc;
import kn.DAO_web;

public class sanpham_dao implements DAO_web<sanpham> {
	private  String all ="select *from sanpham";
	private String insert="insert into "
			+ "sanpham(tensp,gia,thietke,chatlieu,kichthuoc,khoiluong,ngayramat,soCamera,soSIM,dungluongpin,kichthuocman,chip,chansac,hotrosac,"
			+ "image_home,image_home2,image_home3,image_home4,"
			+ "luotmua,danhgia,giamgia,iddanhmuc,baohanh) "
			+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private String update="update sanpham set tensp=?,gia=?,thietke=?,chatlieu=?,kichthuoc=?,"
			+ "khoiluong=?,ngayramat=?,soCamera=?,soSIM=?,dungluongpin=?,kichthuocman=?,"
			+ "chip=?,chansac=?,hotrosac=?,image_home=?,image_home2=?,image_home3=?,"
			+ "image_home4=?,luotmua=?,danhgia=?,giamgia=?,iddanhmuc=?,baohanh=?	where idsanpham=?";
	private String delete="delete from sanpham where idsanpham=?";
	private String search_id="select *from sanpham where idsanpham=?";
	private String search_name="select *from sanpham where tensp=?";

	@Override
	public ArrayList<sanpham> getAll() throws SQLException {
		Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<sanpham> sp = new ArrayList<sanpham>();
		 if(con!=null) {
			 pr= con.prepareStatement(all);
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 sanpham danh= new sanpham(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getInt(20),rs.getDouble(21),rs.getDouble(22),rs.getString(23),rs.getString(24));
			 System.out.println(danh.toString());
			 sp.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return sp;
	}

	@Override
	public void insert(sanpham t) throws SQLException {
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
			pr.setString(18, t.getImage_home4());
			
			pr.setInt(19, t.getLuotmua());
			pr.setDouble(20, t.getDanhgia());
			pr.setDouble(21, t.getGiamgia());
			pr.setString(22, t.getIddanhmuc());
			
			pr.setString(23, t.getBaohanh());
		
			
			
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
	}

	@Override
	public void update(sanpham t) throws SQLException {
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
			pr.setString(18, t.getImage_home4());
		
			pr.setInt(19, t.getLuotmua());
			pr.setDouble(20, t.getDanhgia());
			pr.setDouble(21, t.getGiamgia());
			pr.setString(22, t.getIddanhmuc());			
	
			pr.setString(23, t.getBaohanh());
	
			pr.setInt(24, t.getIdsanpham());
			pr.executeUpdate();
			
		}
	
		 pr.close();
		 con.close();
		
		
	}

	@Override
	public void delete(sanpham t) throws SQLException {
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
	public ArrayList<sanpham> getName(sanpham t) throws SQLException {
		Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<sanpham> sp = new ArrayList<sanpham>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_name);
			 pr.setString(1, t.getTensp());
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 sanpham danh= new sanpham(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getInt(20),rs.getDouble(21),rs.getDouble(22),rs.getString(23),rs.getString(24));
			 System.out.println(danh.toString());
			 sp.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return sp;
	}

	@Override
	public ArrayList<sanpham> getId(sanpham t) throws SQLException {
		Connection con = kn.connection.getconnection();
		 PreparedStatement pr = null;
		 ResultSet rs = null;
		 ArrayList<sanpham> sp = new ArrayList<sanpham>();
		 if(con!=null) {
			 pr= con.prepareStatement(search_id);
			 pr.setInt(1, t.getIdsanpham());
			 
			 rs= pr.executeQuery();
			 
		 }
		 while(rs.next()) {
			 sanpham danh= new sanpham(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getInt(20),rs.getDouble(21),rs.getDouble(22),rs.getString(23),rs.getString(24));
			 System.out.println(danh.toString());
			 sp.add(danh);
			 
		 }
		 rs.close();
		 pr.close();
		 con.close();

		return sp;
	}
//	public static void main(String[] args) {
//sanpham_dao d = new sanpham_dao();
//sanpham sp = new sanpham(
//        1, "Sản phẩm 1", 1000.0, "Thiết kế đẹp", "Chất liệu tốt", "Kích thước chuẩn", 
//        0.5, "2024-01-01", 4, 2, 5000, "6.5 inches", "Chip ABC", "USB-C", "Sạc nhanh", 
//        "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", 
//        "image5.jpg", "image6.jpg", "image7.jpg", "image8.jpg", 
//        100, 4.5, 10.0, "ip"
//    );
//sanpham sp2 = new sanpham(
//       "iphone11", 1000.0, "Thiết kế đẹp", "Chất liệu tốt", "Kích thước chuẩn", 
//        0.5, "2024-01-01", 4, 2, 5000, "6.5 inches", "Chip ABC", "USB-C", "Sạc nhanh", 
//        "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", 
//        "image5.jpg", "image6.jpg", "image7.jpg", "image8.jpg", 
//        100, 4.5, 10.0, "ip"
//    );
//sanpham sp3 = new sanpham(
//        1, "Sản phẩm 1", 1000.0, "Thiết kế đẹp", "Chất liệu tốt", "Kích thước chuẩn", 
//        0.5, "2024-01-01", 4, 2, 5000, "6.5 inches", "Chip ABC", "USB-C", "Sạc nhanh", 
//        "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", 
//        "image5.jpg", "image6.jpg", "image7.jpg", "image8.jpg", 
//        100, 4.5, 10.0, "ip"
//    );
//sanpham sp4 = new sanpham(
//        2, "Sản phẩm 1", 1000.0, "Thiết kế đẹp", "Chất liệu tốt", "Kích thước chuẩn", 
//        0.5, "2024-01-01", 4, 2, 5000, "6.5 inches", "Chip ABC", "USB-C", "Sạc nhanh", 
//        "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", 
//        "image5.jpg", "image6.jpg", "image7.jpg", "image8.jpg", 
//        100, 4.5, 10.0, "ip"
//    );
//try {
////	d.insert(sp);
////	d.insert(sp2);
////	d.update(sp3);
//	d.delete(sp3);
//	
//
//	d.getAll();
////	d.getId(sp4);
//	
//	
//	
//	
//	System.out.println("ok");
//} catch (Exception e) {
//	e.printStackTrace();
//}
//}

}

package sanpham;

import java.sql.Date;

public class sanpham {
	 	private int idsanpham;
	    private String tensp;
	    private double gia;
	    private String thietke;
	    private String chatlieu;
	    private String kichthuoc;
	    private double khoiluong;
	    private String ngayramat;
	    private int soCamera;
	    private int soSIM;
	    private int dungluongpin;
	    private String kichthuocman;
	    private String chip;
	    private String chansac;
	    private String hotrosac;
	    private String image_home;
	    private String image_home2;
	    private String image_home3;
	    private String image_home4;
	 
	    private int luotmua;
	    private double danhgia;
	    private double giamgia;
	    private String iddanhmuc; 
	    private String baohanh;
		public sanpham(int idsanpham, String tensp, double gia, String thietke, String chatlieu, String kichthuoc,
				double khoiluong, String ngayramat, int soCamera, int soSIM, int dungluongpin, String kichthuocman,
				String chip, String chansac, String hotrosac, String image_home, String image_home2, String image_home3,
				String image_home4, int luotmua, double danhgia, double giamgia, String iddanhmuc, String baohanh) {
			super();
			this.idsanpham = idsanpham;
			this.tensp = tensp;
			this.gia = gia;
			this.thietke = thietke;
			this.chatlieu = chatlieu;
			this.kichthuoc = kichthuoc;
			this.khoiluong = khoiluong;
			this.ngayramat = ngayramat;
			this.soCamera = soCamera;
			this.soSIM = soSIM;
			this.dungluongpin = dungluongpin;
			this.kichthuocman = kichthuocman;
			this.chip = chip;
			this.chansac = chansac;
			this.hotrosac = hotrosac;
			this.image_home = image_home;
			this.image_home2 = image_home2;
			this.image_home3 = image_home3;
			this.image_home4 = image_home4;
			this.luotmua = luotmua;
			this.danhgia = danhgia;
			this.giamgia = giamgia;
			this.iddanhmuc = iddanhmuc;
			this.baohanh = baohanh;
		}
		public sanpham(String tensp, double gia, String thietke, String chatlieu, String kichthuoc, double khoiluong,
				String ngayramat, int soCamera, int soSIM, int dungluongpin, String kichthuocman, String chip,
				String chansac, String hotrosac, String image_home, String image_home2, String image_home3,
				String image_home4, int luotmua, double danhgia, double giamgia, String iddanhmuc, String baohanh) {
			super();
			this.tensp = tensp;
			this.gia = gia;
			this.thietke = thietke;
			this.chatlieu = chatlieu;
			this.kichthuoc = kichthuoc;
			this.khoiluong = khoiluong;
			this.ngayramat = ngayramat;
			this.soCamera = soCamera;
			this.soSIM = soSIM;
			this.dungluongpin = dungluongpin;
			this.kichthuocman = kichthuocman;
			this.chip = chip;
			this.chansac = chansac;
			this.hotrosac = hotrosac;
			this.image_home = image_home;
			this.image_home2 = image_home2;
			this.image_home3 = image_home3;
			this.image_home4 = image_home4;
			this.luotmua = luotmua;
			this.danhgia = danhgia;
			this.giamgia = giamgia;
			this.iddanhmuc = iddanhmuc;
			this.baohanh = baohanh;
		}
		public sanpham() {
			super();
		}
		public sanpham(int idsanpham) {
			super();
			this.idsanpham = idsanpham;
		}
		public int getIdsanpham() {
			return idsanpham;
		}
		public void setIdsanpham(int idsanpham) {
			this.idsanpham = idsanpham;
		}
		public String getTensp() {
			return tensp;
		}
		public void setTensp(String tensp) {
			this.tensp = tensp;
		}
		public double getGia() {
			return gia;
		}
		public void setGia(double gia) {
			this.gia = gia;
		}
		public String getThietke() {
			return thietke;
		}
		public void setThietke(String thietke) {
			this.thietke = thietke;
		}
		public String getChatlieu() {
			return chatlieu;
		}
		public void setChatlieu(String chatlieu) {
			this.chatlieu = chatlieu;
		}
		public String getKichthuoc() {
			return kichthuoc;
		}
		public void setKichthuoc(String kichthuoc) {
			this.kichthuoc = kichthuoc;
		}
		public double getKhoiluong() {
			return khoiluong;
		}
		public void setKhoiluong(double khoiluong) {
			this.khoiluong = khoiluong;
		}
		public String getNgayramat() {
			return ngayramat;
		}
		public void setNgayramat(String ngayramat) {
			this.ngayramat = ngayramat;
		}
		public int getSoCamera() {
			return soCamera;
		}
		public void setSoCamera(int soCamera) {
			this.soCamera = soCamera;
		}
		public int getSoSIM() {
			return soSIM;
		}
		public void setSoSIM(int soSIM) {
			this.soSIM = soSIM;
		}
		public int getDungluongpin() {
			return dungluongpin;
		}
		public void setDungluongpin(int dungluongpin) {
			this.dungluongpin = dungluongpin;
		}
		public String getKichthuocman() {
			return kichthuocman;
		}
		public void setKichthuocman(String kichthuocman) {
			this.kichthuocman = kichthuocman;
		}
		public String getChip() {
			return chip;
		}
		public void setChip(String chip) {
			this.chip = chip;
		}
		public String getChansac() {
			return chansac;
		}
		public void setChansac(String chansac) {
			this.chansac = chansac;
		}
		public String getHotrosac() {
			return hotrosac;
		}
		public void setHotrosac(String hotrosac) {
			this.hotrosac = hotrosac;
		}
		public String getImage_home() {
			return image_home;
		}
		public void setImage_home(String image_home) {
			this.image_home = image_home;
		}
		public String getImage_home2() {
			return image_home2;
		}
		public void setImage_home2(String image_home2) {
			this.image_home2 = image_home2;
		}
		public String getImage_home3() {
			return image_home3;
		}
		public void setImage_home3(String image_home3) {
			this.image_home3 = image_home3;
		}
		public String getImage_home4() {
			return image_home4;
		}
		public void setImage_home4(String image_home4) {
			this.image_home4 = image_home4;
		}
		public int getLuotmua() {
			return luotmua;
		}
		public void setLuotmua(int luotmua) {
			this.luotmua = luotmua;
		}
		public double getDanhgia() {
			return danhgia;
		}
		public void setDanhgia(double danhgia) {
			this.danhgia = danhgia;
		}
		public double getGiamgia() {
			return giamgia;
		}
		public void setGiamgia(double giamgia) {
			this.giamgia = giamgia;
		}
		public String getIddanhmuc() {
			return iddanhmuc;
		}
		public void setIddanhmuc(String iddanhmuc) {
			this.iddanhmuc = iddanhmuc;
		}
		public String getBaohanh() {
			return baohanh;
		}
		public void setBaohanh(String baohanh) {
			this.baohanh = baohanh;
		}
		@Override
		public String toString() {
			return "sanpham [idsanpham=" + idsanpham + ", tensp=" + tensp + ", gia=" + gia + ", thietke=" + thietke
					+ ", chatlieu=" + chatlieu + ", kichthuoc=" + kichthuoc + ", khoiluong=" + khoiluong
					+ ", ngayramat=" + ngayramat + ", soCamera=" + soCamera + ", soSIM=" + soSIM + ", dungluongpin="
					+ dungluongpin + ", kichthuocman=" + kichthuocman + ", chip=" + chip + ", chansac=" + chansac
					+ ", hotrosac=" + hotrosac + ", image_home=" + image_home + ", image_home2=" + image_home2
					+ ", image_home3=" + image_home3 + ", image_home4=" + image_home4 + ", luotmua=" + luotmua
					+ ", danhgia=" + danhgia + ", giamgia=" + giamgia + ", iddanhmuc=" + iddanhmuc + ", baohanh="
					+ baohanh + "]";
		}	  
		
	    
	    
	    
	    
	    
}

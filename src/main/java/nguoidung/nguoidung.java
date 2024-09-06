package nguoidung;

public class nguoidung {
	private int  idnguoidung; 
	private String	email;
	private String	matkhau; 
	private String hoten; 
	private String sdt;
	private String diachi;
	public nguoidung(int idnguoidung, String email, String matkhau, String hoten, String sdt, String diachi) {
		super();
		this.idnguoidung = idnguoidung;
		this.email = email;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.sdt = sdt;
		this.diachi = diachi;
	}
	public nguoidung(String email, String matkhau, String hoten, String sdt, String diachi) {
		super();
		this.email = email;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.sdt = sdt;
		this.diachi = diachi;
	}
	public nguoidung() {
		super();
	}
	public int getIdnguoidung() {
		return idnguoidung;
	}
	public void setIdnguoidung(int idnguoidung) {
		this.idnguoidung = idnguoidung;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	@Override
	public String toString() {
		return "nguoidung [idnguoidung=" + idnguoidung + ", email=" + email + ", matkhau=" + matkhau + ", hoten="
				+ hoten + ", sdt=" + sdt + ", diachi=" + diachi + "]";
	} 
	
	
	
	
	
	

}

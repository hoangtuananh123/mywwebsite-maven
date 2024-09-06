package dathangqb;

public class dathangqb {
	public int idkhachhang;
	public String namenew;
	public String  sodienthoai;
	public String diachi;
	public dathangqb(int idkhachhang, String namenew, String sodienthoai, String diachi) {
		super();
		this.idkhachhang = idkhachhang;
		this.namenew = namenew;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
	}
	public dathangqb(String namenew, String sodienthoai, String diachi) {
		super();
		this.namenew = namenew;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
	}
	public dathangqb() {
		super();
	}
	public int getIdkhachhang() {
		return idkhachhang;
	}
	public void setIdkhachhang(int idkhachhang) {
		this.idkhachhang = idkhachhang;
	}
	public String getNamenew() {
		return namenew;
	}
	public void setNamenew(String namenew) {
		this.namenew = namenew;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	@Override
	public String toString() {
		return "dathangqb [idkhachhang=" + idkhachhang + ", namenew=" + namenew + ", sodienthoai=" + sodienthoai
				+ ", diachi=" + diachi + "]";
	}
	
	

}

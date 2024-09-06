package giohang;

public class giohang {
	private int idgio;
	private int idnguoidung;
	private float tonggia;
	public giohang(int idnguoidung, float tonggia) {
		super();
		this.idnguoidung = idnguoidung;
		this.tonggia = tonggia;
	}
	public giohang() {
		super();
	}
	public giohang(int idgio, int idnguoidung, float tonggia) {
		super();
		this.idgio = idgio;
		this.idnguoidung = idnguoidung;
		this.tonggia = tonggia;
	}
	public int getIdgio() {
		return idgio;
	}
	public void setIdgio(int idgio) {
		this.idgio = idgio;
	}
	public int getIdnguoidung() {
		return idnguoidung;
	}
	public void setIdnguoidung(int idnguoidung) {
		this.idnguoidung = idnguoidung;
	}
	public float getTonggia() {
		return tonggia;
	}
	public void setTonggia(float tonggia) {
		this.tonggia = tonggia;
	}
	@Override
	public String toString() {
		return "giohang [idgio=" + idgio + ", idnguoidung=" + idnguoidung + ", tonggia=" + tonggia + "]";
	}
	

}

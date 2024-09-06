package danhmuc;

public class danhmuc {
	private String iddanhmuc;
	private String tendanhmuc;
	private String mota;
	
	
	public danhmuc() {
		super();
	}
	public danhmuc(String tendanhmuc, String mota) {
		super();
		this.tendanhmuc = tendanhmuc;
		this.mota = mota;
	}
	public danhmuc(String iddanhmuc, String tendanhmuc, String mota) {
		super();
		this.iddanhmuc = iddanhmuc;
		this.tendanhmuc = tendanhmuc;
		this.mota = mota;
	}
	public String getIddanhmuc() {
		return iddanhmuc;
	}
	public void setIddanhmuc(String iddanhmuc) {
		this.iddanhmuc = iddanhmuc;
	}
	public String getTendanhmuc() {
		return tendanhmuc;
	}
	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	@Override
	public String toString() {
		return "danhmuc [iddanhmuc=" + iddanhmuc + ", tendanhmuc=" + tendanhmuc + ", mota=" + mota + "]";
	}
	
	
	

}

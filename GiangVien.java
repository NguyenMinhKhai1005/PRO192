public class GiangVien extends lab3 {
	private String danhSach, hocPhan;
	public GiangVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi,
			String danhSach, String hocPhan) {
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, diaChi);
		this.danhSach = danhSach;
		this.hocPhan = hocPhan;
	}
	public String getDanhSach() {
		return danhSach;
	}
	public void setDanhSach(String danhSach) {
		this.danhSach = danhSach;
	}
	public String getHocPhan() {
		return hocPhan;
	}
	public void setHocPhan(String hocPhan) {
		this.hocPhan = hocPhan;
	}
	
	
	public void monHocSeDay () {
		System.out.println("MAD101");
		System.out.println("PRO192");
		System.out.println("OSG202");
		System.out.println("SSG104");
		System.out.println("NWC203c");
	}
	public void hienThiMonHoc () {
		System.out.println("MAD101");
		System.out.println("PRO192");
		System.out.println("OSG202");
		System.out.println("SSG104");
		System.out.println("NWC203c");
	}
}
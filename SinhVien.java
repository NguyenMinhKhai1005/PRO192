public class SinhVien extends lab3 {
	private String chuyenNganh;

	public SinhVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi,
			String chuyenNganh) {
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, diaChi);
		this.chuyenNganh = chuyenNganh;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	
	public void hienThiMonHocChuyenNganh() {
		System.out.println("MAD101");
		System.out.println("PRO192");
		System.out.println("OSG202");
		System.out.println("SSG104");
		System.out.println("NWC203c");
	}
}
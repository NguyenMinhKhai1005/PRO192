import java.util.ArrayList;
import java.util.List;

public class SinhVien extends Person {
	private String chuyenNganh;
	private List<String> danhSachMonHocTheoChuyenNganh;

	public SinhVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi,
			String chuyenNganh) {
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, diaChi);
		this.chuyenNganh = chuyenNganh;
		danhSachMonHocTheoChuyenNganh = new ArrayList<>();
	}

	public void hienThiChuyenNganh() {
		System.out.println(chuyenNganh);
	}	

	public void themMonHoc(String monHocTheoChuyenNganh) {
		danhSachMonHocTheoChuyenNganh.add(monHocTheoChuyenNganh);
	}

	public void hienThiMonHocTheoChuyenNganh(){
		System.out.println("Cac mon hoc theo chuyen nganh: ");
		for (String monHocTheoChuyenNganh : danhSachMonHocTheoChuyenNganh) {
			System.out.println(monHocTheoChuyenNganh);
		}
	}
}
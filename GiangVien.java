import java.util.ArrayList;
import java.util.List;

public class GiangVien extends Person {
	private List<String> danhSachMonHoc;

	public GiangVien(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String address){
		super(email, hoTen, namSinh, gioiTinh, soDienThoai, address);
		danhSachMonHoc = new ArrayList<>();
	}

	public void themMonHoc(String monHoc) {
		danhSachMonHoc.add(monHoc);
	}

	public void hienThiMonHoc() {
		System.out.println("Danh sach mon hoc se day: ");
		for (String monHoc : danhSachMonHoc) {
			System.out.println(monHoc);		
		}
	}
}
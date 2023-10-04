package lab3;

public class test {
	public static void main(String[] args) {
		PerSon ps = new PerSon("minhkhain159@gmail.com", "Nguyễn Minh Khải", 2004, "Nam", "0399387215", "159/1 Lê Lợi");
		ps.hienThiThongTin();
		ps.thayDoiDiaChi("535 Trần Hưng Đạo");
		ps.thayDoiSoDienThoai("0766613632");
		
		
		GiangVien gv = new GiangVien("minhkhain159@gmail.com", "Nguyễn Minh Khải", 2004, "Nam", "0399387215", "159/1 Lê Lợi", "dslop", "E");
		gv.hienThiMonHoc();
		gv.monHocSeDay();
		
		
		SinhVien sv = new SinhVien("minhkhain159@gmail.com", "Nguyễn Minh Khải", 2004, "Nam", "0399387215", "159/1 Lê Lợi", "SE");
		sv.hienThiMonHocChuyenNganh();
		}
}

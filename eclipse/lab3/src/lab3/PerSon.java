package lab3;

public class PerSon {
    private String email;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;

    public PerSon(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
        this.email = email;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public PerSon(String string) {
		// TODO Auto-generated constructor stub
	}

	public void hienThiThongTin() {
        System.out.println("Thong tin ca nhan:");
        System.out.println("Email: " + email);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Dia chi: " + diaChi);
    }

    public void thayDoiSoDienThoai(String soDienThoaiMoi) {
        this.soDienThoai = soDienThoaiMoi;
    }

    public void thayDoiDiaChi(String diaChiMoi) {
        this.diaChi = diaChiMoi;
    }
}


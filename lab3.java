public class lab3 {
    private String email;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String soDienThoai;
    private String diaChi;

    public lab3(String email, String hoTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
        this.email = email;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
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

    public static void main(String[] args) {
        lab3 sinhVien = new lab3("minhkhain159@gmail.com", "Nguyen Minh Khai", 2004, "Nam", "0399387215", "159/1 Le Loi, Thanh pho Quy Nhon");

        sinhVien.hienThiThongTin();

        sinhVien.thayDoiSoDienThoai("0766613632");
        sinhVien.thayDoiDiaChi("367 Tran Hung Dao, Thanh pho Ho Chi Minh");

        sinhVien.hienThiThongTin();
    }
}

public class GVandSV {
    public static void main(String[] args) {
        GiangVien gv = new GiangVien("namvv1996@gmail.com", "Vo Van Nam", 1996, "Nam", "0746537287", "467 Tran Hung Dao");
        gv.themMonHoc("Toan");
        gv.themMonHoc("Toan roi rac");

        gv.displayInfo();
        gv.hienThiMonHoc();

        SinhVien sv = new SinhVien("minhkhain159@gmail.com", "Nguyen Minh Khai", 2004, "Nam", "0399387215", "159/1 Le Loi", "Ky thuat phan mem");
        sv.themMonHoc("Khoa hoc may tinh");
        sv.themMonHoc("He dieu hanh may tinh");
        sv.themMonHoc("Lam viec nhom");
        sv.themMonHoc("Lap trinh huong doi tuong");
        
        sv.displayInfo();
        sv.hienThiMonHocTheoChuyenNganh();

    }    
}

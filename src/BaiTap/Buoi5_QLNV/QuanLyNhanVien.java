package BaiTap.Buoi5_QLNV;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyNhanVien {

    // Danh sách nhân viên
    private ArrayList<NhanVien> danhSach = new ArrayList<>();

    // 1. Thêm nhân viên
    public void themNhanVien(Scanner scan) {
        NhanVien nv = new NhanVien();
        nv.input(scan);
        danhSach.add(nv);
        System.out.println("=> Thêm nhân viên thành công!");
    }

    // 2. Hiển thị danh sách
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        for (NhanVien nv : danhSach) {
            nv.display();
        }
    }

    // 3. Xóa nhân viên theo ID
    public void xoaNhanVien(Scanner scan) {
        System.out.print("Nhập ID cần xóa: ");
        String id = scan.nextLine();

        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getId().equals(id)) {
                danhSach.remove(i);
                System.out.println("=> Xóa thành công!");
                return;
            }
        }

        System.out.println("=> Không tìm thấy!");
    }

    // 4. Tìm nhân viên theo ID
    public void timNhanVien(Scanner scan) {
        System.out.print("Nhập ID cần tìm: ");
        String id = scan.nextLine();

        for (NhanVien nv : danhSach) {
            if (nv.getId().equals(id)) {
                nv.display();
                return;
            }
        }

        System.out.println("=> Không tìm thấy!");
    }
}

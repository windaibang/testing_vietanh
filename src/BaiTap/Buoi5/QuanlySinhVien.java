package BaiTap.Buoi5;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class QuanlySinhVien {
    //thuộc tính
    private static ArrayList<SinhVien> danhsachsinhvien = new ArrayList<>();

    //phương thức
    public static void themsinhvien(Scanner scan) {
        // tạo ra đối tượng sinh viên từ lớp đối tượng
        SinhVien sv = new SinhVien();
        // gọi phương thức input để nhập thông tin sinh viên
        sv.input(scan);
        // thêm sinh viên vào danh sách
        danhsachsinhvien.add(sv);
        System.out.println("Thêm sinh viên thành công.");
    }

    public void hienthidanhsachsinhvien() {
        // lưu ý: nếu DSSV rỗng thì phải hiện thị thông báo rỗng.
        if (danhsachsinhvien.isEmpty()) {
            System.out.println("Không có SV nào trong danh sách!");
        } else {
            for (SinhVien sv : danhsachsinhvien) {
                sv.display();
            }
        }
    }

    // phương thức xóa SV dựa vào id
    public void xoaSinhVien(Scanner scan) {
        System.out.println("Nhập id Sinh Viên Cần Xóa: ");
        String id = scan.nextLine();
        // giải quyết bài toán theo cách đặt cờ hiệu
        boolean found = false; // chưa tìm thấy được sv cần xóa
        for (SinhVien sv : danhsachsinhvien) {
            if (sv.getId().equals(id)) {
                danhsachsinhvien.remove(sv);
                System.out.println("Xóa SV thành công.");
                found = true; // đã tìm thấy sv cần xóa
                break;
            }
        }
        if (!found) {
            System.out.println("không tìm thấy sinh viên với id: " + id);
        }
    }

    public void timSinhVien(Scanner scan) {
        System.out.println("Nhập id sv cần tìm: ");
        String id = scan.nextLine();
        // giải quyết bài toán theo cách đặt cờ hiệu
        boolean found = false; // chưa tìm thấy được sv cần tìm
        for (SinhVien sv : danhsachsinhvien) {
            if (sv.getId().equals(id)) {
                System.out.println("Thông tin SV cần tìm.");
                sv.display();
                found = true; // đã tìm thấy sv cần tìm
                break; // thoát
            }

        }
        if (!found) {
            System.out.println("không tìm thấy sinh viên với id: " + id);
        }
    }
}
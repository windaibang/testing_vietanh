package BaiTap.Buoi5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baitapbuoi5_sinhVien {
    public static void main(String[] args) {
        // Bài tập QLSV thông qua menu có 4 chức năng chính
        // 1. Thêm SV
        // 2. Xóa SV
        // 3. Hiển thị danh sách sinh viên
        // 4. Tìm Sinh Viên Theo ID
        // 5. thoát chương trình.
        // Note: Mỗi SV có các thuộc tính name,age,address

        Scanner scan = new Scanner(System.in);
        QuanlySinhVien QuanlySinhVien = new QuanlySinhVien();
        int choice;

        System.out.println("--------Quản Lý Sinh Viên---------");
        System.out.println(" 1. Thêm Sinh Viên ");
        System.out.println(" 2. Hiển thị danh sách Sinh Viên ");
        System.out.println(" 3. Xóa Sinh Viên ");
        System.out.println(" 4. tìm Sinh Viên theo ID ");
        System.out.println(" 5. thoát khỏi trương chình ");
        System.out.println("=============================");
        System.out.println(" Nhập lựa chọn của bạn đi");
        choice = scan.nextInt();
        scan.nextLine();
        switch (choice){
            case 1:
                BaiTap.Buoi5.QuanlySinhVien.themsinhvien(scan);
            case 2:
                QuanlySinhVien.hienthidanhsachsinhvien();
            case 3:
                QuanlySinhVien.timSinhVien(scan);
                break;
            case 4:
                QuanlySinhVien.xoaSinhVien(scan);
                break;
            case 5:
                System.out.println("Thoát chương trình thành công");

            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại ");
        }
    }
}

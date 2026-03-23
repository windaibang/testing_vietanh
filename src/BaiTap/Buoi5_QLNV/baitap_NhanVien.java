package BaiTap.Buoi5_QLNV;
import java.util.Scanner;
public class baitap_NhanVien {
    public static void main(String[] args) {
        //BT nhân Viên với MEnu
        //1 Thêm nhân VIên
        //2 hiển thị danh sách Nhân Viên
        //3 xóa nhân viên dựa vào id
        //4 tìm kiếm nhân viên dựa vào id
        //5 tìm nhân viên có mức lương cao nhất
        //6 Tìm nhân viên có số giờ làm thấp nhất
        //7 sắp sếp nhân viên theo tên
        //8 sắp sếp nhân viên theo số giờ làm
        //9 cập nhật thông tin dựa vào id
        //10 cập nhật số giờ làm của nhân viên dựa vào id
        //11 hiển thị ra nhân viên có tổng số giờ làm lớn hơn 120 giờ
        //12 hiển thị ra nhân viên có tổng giờ làm nhỏ hơn 80 giờ
        //13 thoát khỏi chương trình
        // Nhân viên = {id,name,age,address,salaryPerHours,totalWorkingHours}


        Scanner scan = new Scanner(System.in);
        QuanLyNhanVien ql = new QuanLyNhanVien();

        int choice;

        while (true) {
            System.out.println("\n====== QUẢN LÝ NHÂN VIÊN ======");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Tìm nhân viên theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    ql.themNhanVien(scan);
                    break;
                case 2:
                    ql.hienThiDanhSach();
                    break;
                case 3:
                    ql.xoaNhanVien(scan);
                    break;
                case 4:
                    ql.timNhanVien(scan);
                    break;
                case 5:
                    System.out.println("Thoát!");
                    return;
                default:
                    System.out.println("Sai lựa chọn!");
            }
        }
    }
}





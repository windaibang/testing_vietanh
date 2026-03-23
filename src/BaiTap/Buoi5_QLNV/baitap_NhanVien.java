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

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm Nhân Viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Xóa Nhân Viên ");
            System.out.println("4. Tìm");
            System.out.println("5. Nhân Viên có Lương cao nhất");
            System.out.println("6. Nhân Viên Có Giờ thấp nhất");
            System.out.println("7. Sắp xếp tên nhân viên");
            System.out.println("8. sắp xếp nhân viên theo số giờ làm");
            System.out.println("9. Update thông tin theo ID");
            System.out.println("10. Update giờ làm nhân viên");
            System.out.println("11. các nhân viên làm trên  >120 giờ");
            System.out.println("12. các nhân viên làm dưới <80 giờ");
            System.out.println("13. Thoát");

            System.out.print("Chọn: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1: ql.themNhanVien(scan); break;
                case 2: ql.hienThi(); break;
                case 3: ql.xoa(scan); break;
                case 4: ql.tim(scan); break;
                case 5: ql.luongMax(); break;
                case 6: ql.gioMin(); break;
                case 7: ql.sortTen(); break;
                case 8: ql.sortGio(); break;
                case 9: ql.update(scan); break;
                case 10: ql.updateGio(scan); break;
                case 11: ql.lonHon120(); break;
                case 12: ql.nhoHon80(); break;
                case 13: System.out.println("Bye!"); break;
                default: System.out.println("Sai!");
            }

        } while(choice != 13);
    }
}





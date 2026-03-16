package BaiTap;
import java.util.Scanner;
public class Baitap2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ho ten HS: ");
        String hoten = scan.nextLine();
        System.out.print(" nhap luong: ");
        int luong = Integer.parseInt(scan.nextLine());
        System.out.print(" so ngay lam ");
        int songaylam = Integer.parseInt(scan.nextLine());
        int LuongNV = songaylam * luong;
        System.out.println("------Ket Qua----- ");
        System.out.print(" Luong NV: "+ LuongNV);

    }
}
